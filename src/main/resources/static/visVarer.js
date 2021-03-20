$(() => {
    hentSortering();
    const type = {
        type : "Alle",
        sortType : "None"
    }
    hentVarer(type);
})

const hentSortering = () => {
    $.get("/hentSortering/?type=type", typer => {
        for(const t of typer) {
            const valg = "<option value='"+t+"'>"+t+"</option>"
            $("#velgVareType").append(valg)
        }
    })

    $.get("/hentSortering/?type=sort", sortering => {
        for(const s of sortering) {
            const valg = "<option value='"+s+"'>"+s+"</option>"
            $("#velgSortering").append(valg)
        }
    })
}

const hentVarer = sort => {
    $.post("/hentVarer", sort, varer => {
        formaterData(varer);
    })
}

const formaterData = varer => {
    $("#vareSortement").find("tr:gt(0)").remove();
    for(const vare of varer) {
        console.log(vare.navn)
        let ut = "<tr>" +
            "<td>"+vare.lopeNr+"</td>" +
            "<td>"+vare.antall+"</td>" +
            "<td>"+vare.navn+"</td>" +
            "<td>"+vare.vekt+"</td>" +
            "<td>"+vare.pris+"</td>" +
            "<td>"+vare.antallBen+"</td>" +
            "</tr>"
        $("#vareSortement").append(ut)
    }
}

const typeSorterValgt = typeSort => {
    const type = {
        type : typeSort,
        sortType : "None"
    }
    hentVarer(type)
}

const sorterValgt = typeSort => {
    const type = {
        type : $("#velgVareType").val(),
        sortType : typeSort
    }
    hentVarer(type)
}