function hideSection() {
    if ($('.home').hasClass('active')) {
        $('#teams').fadeOut();
    } else if ($('.schedule').hasClass('active')) {
        $('#dailySchedule').fadeOut();
    } else if ($('.standings').hasClass('active')) {
        $('#standings').fadeOut();
    } else if ($('.news').hasClass('active')) {
        $('#news').fadeOut();
    }  else if ($('.leagueLeaders').hasClass('active')) {
        $('#leagueLeaders').fadeOut();
    }
}

    /**********************************************************************************************************************/
    function teamPageHideSection() {
        if ($('.upcomingSchedule').hasClass('active')) {
            $('#upcomingSchedule').fadeOut();
        } else if ($('.roster').hasClass('active')) {
            $('#roster').fadeOut();
        } else if ($('.hittingStats').hasClass('active')) {
            $('#hittingStats').fadeOut();
        } else if ($('.pitchingStats').hasClass('active')) {
            $('#pitchingStats').fadeOut();
        }
    }

    /**********************************************************************************************************************/
    function playerPageHideSection() {
        if ($('.projectedStats').hasClass('active')) {
            $('#projectedStats').fadeOut();
        } else if ($('.seasonStats').hasClass('active')) {
            $('#seasonStats').fadeOut();
        } else if ($('.careerStats').hasClass('active')) {
            $('#careerStats').fadeOut();
        }
    }

    /**********************************************************************************************************************/
    $(".upcomingSchedule").click(function () {

        teamPageHideSection()

        $('.nav li a.active').removeClass('active');
        $(this).addClass('active');

        $('#upcomingSchedule').fadeIn('slow');
    })
    /**********************************************************************************************************************/
    $(".roster").click(function () {

        teamPageHideSection()

        $('.nav li a.active').removeClass('active');
        $(this).addClass('active');

        $('#roster').fadeIn('slow');
        return false;
    })
    /**********************************************************************************************************************/
    $(".hittingStats").click(function () {

        teamPageHideSection()

        $('.nav li a.active').removeClass('active');
        $(this).addClass('active');

        $('#hittingStats').fadeIn('slow');
        return false;
    })
    /**********************************************************************************************************************/
    $(".pitchingStats").click(function () {

        teamPageHideSection()

        $('.nav li a.active').removeClass('active');
        $(this).addClass('active');

        $('#pitchingStats').fadeIn('slow');
        return false;
    })
    /**********************************************************************************************************************/
    $(".projectedStats").click(function () {

        playerPageHideSection()

        $('.nav li a.active').removeClass('active');
        $(this).addClass('active');

        $('#projectedStats').fadeIn('slow');

        return false;
    })
    /**********************************************************************************************************************/
    $(".seasonStats").click(function () {

        playerPageHideSection()

        $('.nav li a.active').removeClass('active');
        $(this).addClass('active');

        $('#seasonStats').fadeIn('slow');

        return false;
    })
    /**********************************************************************************************************************/
    $(".careerStats").click(function () {

        playerPageHideSection()

        $('.nav li a.active').removeClass('active');
        $(this).addClass('active');

        $('#careerStats').fadeIn('slow');

        return false;
    })
    /**********************************************************************************************************************/
    $(".home").click(function () {

        hideSection()

        $('.nav li a.active').removeClass('active');
        $(this).addClass('active');

        $('#teams').fadeIn('slow');

    })

    /**********************************************************************************************************************/
    let stadiums = ""
    $(".schedule").click(function (e) {

        hideSection()

        $('#dailySchedule').remove();

        $('.nav li a.active').removeClass('active');

        $(this).addClass('active');

        $.get("http://localhost:8080/stadiums", function (data) {
            stadiums = data
        })

        $.get("http://localhost:8080/dailyschedule", function (data) {

            let dailySchedule = $('<div id="dailySchedule"></div>')

            let cardRow = $('<div class="row"></div>')

            $.each(data, function (i) {
                let cardHeader = $("<div class=\"card-header text-center\" style='background-color: darkcyan; color: white'>" + data[i].Status + "</div>")

                let cardBody = $('<div class="card-body"></div>')

                cardBody.append("<h5 class='card-title'>" + data[i].AwayTeam + ' at ' + data[i].HomeTeam + "</h5>")

                let weatherUrl = ""

                $.each(stadiums, function (e) {
                    if (data[i].StadiumID === stadiums[e].StadiumID) {
                        cardBody.append("<p class=\"card-text\"><small class=\"text-muted\">" + stadiums[e].Name + "</small></p>")
                        weatherUrl = "http://localhost:8080/weather/" + stadiums[e].City
                    }
                })


                $.get(weatherUrl, function (data) {
                    console.log(data)
                })

                cardBody.append("<p2 class='card-text'>" + "Start Time: " + data[i].DateTime.substring(11, 16) + "</p2>")

                if (data[i].AwayTeamRuns === undefined) {
                    cardBody.append("<p class='card-text'>" + "Score: None" + "</p>")
                } else {
                    cardBody.append("<p class='card-text'>" + "Score: " + data[i].AwayTeamRuns + "-" + data[i].HomeTeamRuns + " (" + data[i].InningHalf + ": " + data[i].Inning + ")" + "</p>")
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

        hideSection()

        $('#standings').remove();

        $('.nav li a.active').removeClass('active');

        $(this).addClass('active');

        $.get("http://localhost:8080/standings", function (data) {

            const standings = $('<div id="standings"></div>')

            function generateTable(tableHeadClass, tableName) {
                const Table = $('<table class="table"></table>')
                const TableHead = $('<thead></thead>').addClass(tableHeadClass)

                const TableTr = $('<tr></tr>')
                TableTr.append("<th scope='col'>" + tableName + "</th>")
                TableTr.append("<th scope='col'>" + "W" + "</th>")
                TableTr.append("<th scope='col'>" + "L" + "</th>")


                TableTr.append("<th scope='col'>" + "PCT" + "</th>")
                TableTr.append("<th scope='col'>" + "GB" + "</th>")
                TableTr.append("<th scope='col'>" + "WCGB" + "</th>")
                TableTr.append("<th scope='col'>" + "L10" + "</th>")
                TableTr.append("<th scope='col'>" + "STRK" + "</th>")

                TableHead.append(TableTr)
                Table.append(TableHead)

                return Table
            }

            function generateTableBody(i, indexTerminate) {
                const tablebody = $('<tbody></tbody>')

                while (i < indexTerminate) {
                    const tablebodyTr = $('<tr></tr>')

                    tablebodyTr.append("<th scope='row'>" + data[i].Name + "</th>")
                    tablebodyTr.append("<td>" + data[i].Wins + "</td>")
                    tablebodyTr.append("<td>" + data[i].Losses + "</td>")
                    tablebodyTr.append("<td>" + data[i].Percentage.toString().substring(1, 5) + "</td>")

                    if (data[i].GamesBehind === undefined) {
                        tablebodyTr.append("<td>" + "0" + "</td>")
                    } else {
                        tablebodyTr.append("<td>" + data[i].GamesBehind + "</td>")
                    }

                    if (data[i].WildCardGamesBehind === undefined) {
                        tablebodyTr.append("<td>" + "0" + "</td>")
                    } else {
                        tablebodyTr.append("<td>" + data[i].WildCardGamesBehind + "</td>")
                    }

                    tablebodyTr.append("<td>" + data[i].LastTenGamesWins + "-" + data[i].LastTenGamesLosses + "</td>")
                    tablebodyTr.append("<td>" + data[i].Streak + "</td>")

                    tablebody.append(tablebodyTr)

                    i++;
                }

                return tablebody
            }

            const alCentralTable = generateTable("bg-danger", "AL Central")
            alCentralTable.append(generateTableBody(0, 5))

            const alEastTable = generateTable("bg-danger", "AL East")
            alEastTable.append(generateTableBody(5, 10))

            const alWestTable = generateTable("bg-danger", "AL West")
            alWestTable.append(generateTableBody(10, 15))

            const nlCentralTable = generateTable("bg-primary", "NL Central")
            nlCentralTable.append(generateTableBody(15, 20))

            const nlEastTable = generateTable("bg-primary", "NL East")
            nlEastTable.append(generateTableBody(20, 25))

            const nlWestTable = generateTable("bg-primary", "NL West")
            nlWestTable.append(generateTableBody(25, 30))


            standings
                .append(alEastTable)
                .append(alCentralTable)
                .append(alWestTable)
                .append(nlEastTable)
                .append(nlCentralTable)
                .append(nlWestTable)

            $(".main").append(standings)
        })
    })
    /**********************************************************************************************************************/
    $(".news").click(function (e) {
        hideSection();

        $('#news').remove();

        $('.nav li a.active').removeClass('active');

        $(this).addClass('active');

        $.get("http://localhost:8080/news", function (data) {
            const news = $('<div id="news"></div>');

            $.each(data, function (i) {
                const card = $('<div class="card text-center" style="margin-bottom: 30px"></div>');
                card.append($("<div class='card-header bg-danger' style='color: white'>" + data[i].Updated.substring(0, 10) + "</div>"));

                const cardBody = $('<div class="card-body"></div>');

                cardBody
                    .append("<h5 class='card-title'>" + data[i].Title + "</h5>")
                    .append("<a class='btn btn-primary' style='color: white'" + "href=" + "'" + data[i].Url + "'" + ">" + "Full Story" + "</a>");

                card.append(cardBody);

                card.append($("<div class='card-footer text-muted'>" + data[i].TimeAgo + "</div>"))

                news.append(card)
            })

            $(".main").append(news)
        })
    })

    /**********************************************************************************************************************/
    function generateLeagueLeadersTable(tableHeadClass, tableName, stat) {
        const Table = $('<table class="table table-hover"></table>')
        const TableHead = $('<thead></thead>').addClass(tableHeadClass)

        const TableTr = $('<tr></tr>')
        TableTr.append("<th scope='col'>" + tableName + "</th>")
        TableTr.append("<th scope='col'>" + "Name" + "</th>")
        TableTr.append("<th scope='col'>" + "Team" + "</th>")
        TableTr.append("<th scope='col'>" + stat + "</th>")

        TableHead.append(TableTr)
        Table.append(TableHead)

        return Table
    }
/**********************************************************************************************************************/
function generateLeagueLeadersTableBody(i, indexTerminate, stat, data) {
    const tablebody = $('<tbody></tbody>')

    while (i < indexTerminate) {
        const tablebodyTr = $('<tr></tr>')

        let statValue = null
        
        switch (stat) {
            case 'hr':
                statValue = data[i].hr
                break
            case 'h':
                statValue = data[i].h
                break
            case 'rbi':
                statValue = data[i].rbi
                break
            case 'avg':
                statValue = data[i].avg
                break
            case 'w':
                statValue = data[i].w
                break
            case 'so':
                statValue = data[i].so
                break
            case 'era':
                statValue = data[i].era
                break
            case 'sv':
                statValue = data[i].sv
                break
        }

        tablebodyTr.append("<th scope='row' style=\"width:20%\">" + "<img src=" + 'http://mlb.mlb.com/mlb/images/players/head_shot/' + data[i].player_id + '.jpg' + " " + "class='img-thumbnail'" + " " + "width='80'" + " " + "height='80'" + ">" + "</th>")
        tablebodyTr.append("<td class=\"align-middle\" style=\"width:25%\">" + data[i].name_display_first_last + "</td>")
        tablebodyTr.append("<td class=\"align-middle\" style=\"width:32%\">" + data[i].team_name + "</td>")
        tablebodyTr.append("<td class=\"align-middle\">" + statValue + "</td>")

        tablebody.append(tablebodyTr)

        i++;
    }

    return tablebody

}
/**********************************************************************************************************************/
function leagueLeadersFadeout(id) {
    $('#'+id).fadeOut(400, function () {
        $('#'+id).remove()
    })
}
/**********************************************************************************************************************/


$(".leagueLeaders").click(function (e) {
    hideSection();

    $('#leagueLeaders').remove();

    $('.nav li a.active').removeClass('active');

    $(this).addClass('active');

    $('.hitter').show();

    $(".loading-main").show()

    $.get("http://localhost:8080/leagueleaders/hitting/hr", function (data) {
        const leagueLeadersHitting = $('<div id="leagueLeadersHitting"></div>');

        const leagueHrLeaders = generateLeagueLeadersTable("bg-danger", "Home Run Leaders", "HR")

        leagueHrLeaders.append(generateLeagueLeadersTableBody(0, 5, "hr", data))

        leagueLeadersHitting.append(leagueHrLeaders)

        $(".loading-main").hide()

        $(".main").append(leagueLeadersHitting)

    })

    $('.hr').click(function (e) {
        leagueLeadersFadeout("leagueLeadersHitting")

        $(".loading-main").show()

        $.get("http://localhost:8080/leagueleaders/hitting/hr", function (data) {
            const leagueLeadersHitting = $('<div id="leagueLeadersHitting"></div>');

            const leagueHrLeaders = generateLeagueLeadersTable("bg-danger", "Home Run Leaders", "HR")

            leagueHrLeaders.append(generateLeagueLeadersTableBody(0, 5, "hr", data))

            leagueLeadersHitting.append(leagueHrLeaders)

            $(".loading-main").hide()

            $(".main").append(leagueLeadersHitting)
        })
    })

    $('.hits').click(function (e) {
        leagueLeadersFadeout("leagueLeadersHitting")

        $(".loading-main").show()

        $.get("http://localhost:8080/leagueleaders/hitting/h", function (data) {
            const leagueLeadersHitting = $('<div id="leagueLeadersHitting"></div>');

            const leagueHrLeaders = generateLeagueLeadersTable("bg-danger", "Hit Leaders", "Hits")

            leagueHrLeaders.append(generateLeagueLeadersTableBody(0, 5, "h", data))

            leagueLeadersHitting.append(leagueHrLeaders)

            $(".loading-main").hide()

            $(".main").append(leagueLeadersHitting)
        })
    })

    $('.rbi').click(function (e) {
        leagueLeadersFadeout("leagueLeadersHitting")

        $(".loading-main").show()

        $.get("http://localhost:8080/leagueleaders/hitting/rbi", function (data) {
            const leagueLeadersHitting = $('<div id="leagueLeadersHitting"></div>');

            const leagueHrLeaders = generateLeagueLeadersTable("bg-danger", "RBI Leaders", "RBI")

            leagueHrLeaders.append(generateLeagueLeadersTableBody(0, 5, "rbi", data))

            leagueLeadersHitting.append(leagueHrLeaders)

            $(".loading-main").hide()

            $(".main").append(leagueLeadersHitting)
        })
    })

    $('.avg').click(function (e) {
        leagueLeadersFadeout("leagueLeadersHitting")

        $(".loading-main").show()

        $.get("http://localhost:8080/leagueleaders/hitting/avg", function (data) {
            const leagueLeadersHitting = $('<div id="leagueLeadersHitting"></div>');

            const leagueHrLeaders = generateLeagueLeadersTable("bg-danger", "Batting Average Leaders", "AVG")

            leagueHrLeaders.append(generateLeagueLeadersTableBody(0, 5, "avg", data))

            leagueLeadersHitting.append(leagueHrLeaders)

            $(".loading-main").hide()

            $(".main").append(leagueLeadersHitting)
        })
    })

    $('.pitcher').show();

    $(".loading-sub").show()

    $.get("http://localhost:8080/leagueleaders/pitching/w", function (data) {
        const leagueLeadersPitching = $('<div id="leagueLeadersPitching"></div>');

        const pitchingLeaders = generateLeagueLeadersTable("bg-primary", "Win Leaders", "Wins")

        pitchingLeaders.append(generateLeagueLeadersTableBody(0, 5, "w", data))

        leagueLeadersPitching.append(pitchingLeaders)

        $(".loading-sub").hide()

        $(".sub").append(leagueLeadersPitching)

    })

    $('.wins').click(function (e) {
        leagueLeadersFadeout("leagueLeadersPitching")

        $(".loading-sub").show()

        $.get("http://localhost:8080/leagueleaders/pitching/w", function (data) {
            const leagueLeadersPitching = $('<div id="leagueLeadersPitching"></div>');

            const pitchingLeaders = generateLeagueLeadersTable("bg-primary", "Win Leaders", "Wins")

            pitchingLeaders.append(generateLeagueLeadersTableBody(0, 5, "w", data))

            leagueLeadersPitching.append(pitchingLeaders)

            $(".loading-sub").hide()

            $(".sub").append(leagueLeadersPitching)

        })
    })

    $('.strikeouts').click(function (e) {
        leagueLeadersFadeout("leagueLeadersPitching")

        $(".loading-sub").show()

        $.get("http://localhost:8080/leagueleaders/pitching/so", function (data) {
            const leagueLeadersPitching = $('<div id="leagueLeadersPitching"></div>');

            const pitchingLeaders = generateLeagueLeadersTable("bg-primary", "Strikeout Leaders", "Strikeouts")

            pitchingLeaders.append(generateLeagueLeadersTableBody(0, 5, "so", data))

            leagueLeadersPitching.append(pitchingLeaders)

            $(".loading-sub").hide()

            $(".sub").append(leagueLeadersPitching)

        })
    })

    $('.era').click(function (e) {
        leagueLeadersFadeout("leagueLeadersPitching")

        $(".loading-sub").show()

        $.get("http://localhost:8080/leagueleaders/pitching/era", function (data) {
            const leagueLeadersPitching = $('<div id="leagueLeadersPitching"></div>');

            const pitchingLeaders = generateLeagueLeadersTable("bg-primary", "ERA Leaders", "ERA")

            pitchingLeaders.append(generateLeagueLeadersTableBody(0, 5, "era", data))

            leagueLeadersPitching.append(pitchingLeaders)

            $(".loading-sub").hide()

            $(".sub").append(leagueLeadersPitching)

        })
    })

    $('.saves').click(function (e) {
        leagueLeadersFadeout("leagueLeadersPitching")

        $(".loading-sub").show()

        $.get("http://localhost:8080/leagueleaders/pitching/sv", function (data) {
            const leagueLeadersPitching = $('<div id="leagueLeadersPitching"></div>');

            const pitchingLeaders = generateLeagueLeadersTable("bg-primary", "Save Leaders", "Saves")

            pitchingLeaders.append(generateLeagueLeadersTableBody(0, 5, "sv", data))

            leagueLeadersPitching.append(pitchingLeaders)

            $(".loading-sub").hide()

            $(".sub").append(leagueLeadersPitching)

        })
    })
})
