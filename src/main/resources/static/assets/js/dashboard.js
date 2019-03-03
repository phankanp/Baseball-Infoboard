$(".home").click(function () {
    $('.nav li a.active').removeClass('active');
    $(this).addClass('active');

    $('#dailySchedule').fadeOut();
    $('#teams').show();
})

/**********************************************************************************************************************/
let stadiums = ""
$(".schedule").click(function (e) {

    $('#dailySchedule').remove();

    $('.nav li a.active').removeClass('active');

    $(this).addClass('active');

    $.get("http://localhost:8080/stadiums", function (data) {
       stadiums = data

    })

    $.get("http://localhost:8080/dailyschedule", function (data) {

        $('#teams').fadeOut();

        let dailySchedule = $('<div id="dailySchedule"></div>')

        let cardRow = $('<div class="row"></div>')

        $.each(data, function(i){
            let cardHeader = $("<div class=\"card-header text-center\" style='background-color: darkcyan'>"+data[i].Status+"</div>")

            let cardBody = $('<div class="card-body"></div>')

            cardBody.append("<h5 class='card-title'>"+data[i].AwayTeam+' at '+data[i].HomeTeam+"</h5>")

            $.each(stadiums, function (e) {
                if (data[i].StadiumID === stadiums[e].StadiumID) {
                    cardBody.append("<p class=\"card-text\"><small class=\"text-muted\">"+stadiums[e].Name+"</small></p>")
                }
            })

            cardBody.append("<p2 class='card-text'>"+"Start Time: "+data[i].DateTime.substring(11,16)+"</p2>")

            console.log(data[i].AwayTeamRuns)

            if (data[i].AwayTeamRuns === undefined) {
                cardBody.append("<p class='card-text'>"+"Score: None"+"</p>")
            } else {
                cardBody.append("<p class='card-text'>"+"Score: "+data[i].AwayTeamRuns+"-"+data[i].HomeTeamRuns+" ("+data[i].InningHalf+": "+data[i].Inning+")"+"</p>")
            }

            let cardCenter = $('<div class="card text-center"></div>')

            let cardColumn = $('<div class="col-md-3 col-sm-6 col-xs-12"></div>')

            cardCenter.append(cardHeader)

            cardCenter.append(cardBody)

            cardColumn.append(cardCenter)

            cardRow.append(cardColumn)
        });

        dailySchedule.append(cardRow)

        $(".main").append(dailySchedule)
    })
})
/**********************************************************************************************************************/
$(".standings").click(function (e) {

})