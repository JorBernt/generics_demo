$(() =>{
    hentTyper();
})

const hentTyper=()=>{
    $.get("/type", typer =>{
        for(const t of typer) {
            const valg = "<option value='"+t+"'>"+t+"</option>"
            $("#velgVareType").append(valg)
        }
    })
}

const typeValgt = type => {
    fjernValg()
    const navn = '<div className="form-group">'+
        '<label for="vareNavn">Varenavn:</label>'+
        '<input type="text" class="form-control" id="vareNavn">'+
            '<div id="vareNavnFeil" style="color: red"></div>'+
        '</div>'
    const antall = '<div className="form-group">'+
        '<label for="antallVarer">Antall:</label>'+
        '<input type="number" class="form-control" id="antallVarer">'+
        '<div id="antallVarerFeil" style="color: red"></div>'+
        '</div>'
    const pris = '<div className="form-group">'+
        '<label for="varePris">Pris:</label>'+
        '<input type="number" class="form-control" id="varePris">'+
        '<div id="varePrisFeil" style="color: red"></div>'+
        '</div>'
    const vekt = '<div className="form-group">'+
        '<label for="vareVekt">Vekt:</label>'+
        '<input type="number" class="form-control" id="vareVekt">'+
        '<div id="vareVektFeil" style="color: red"></div>'+
        '</div>'
    const antallBen = '<div className="form-group">'+
        '<label for="vareAntallBen">Antall ben:</label>'+
        '<input type="number" class="form-control" id="vareAntallBen">'+
        '<div id="vareAntallBenFeil" style="color: red"></div>'+
        '</div>'
    const okKnapp = '<button type="button" class="btn btn-primary" onclick="leggTilVare()">Ok</button> '
    $("#vareSkjema").append(navn)
    $("#vareSkjema").append(antall)
    $("#vareSkjema").append(pris)
    $("#vareSkjema").append(vekt)
    if(type === "Bord")
        $("#vareSkjema").append(antallBen)
    $("#vareSkjema").append(okKnapp)

}

const leggTilVare = () =>{
    let vare = {};
    if($("#velgVareType").val() !== "Bord") {
            vare = {
            navn: $("#vareNavn").val(),
            antall: $("#antallVarer").val(),
            vekt: $("#vareVekt").val(),
            antallBen: 0,
            type: $("#velgVareType").val()
        }
    }
    else {
            vare = {
            navn: $("#vareNavn").val(),
            antall: $("#antallVarer").val(),
            pris: $("#varePris").val(),
            vekt: $("#vareVekt").val(),
            antallBen: $("#vareAntallBen").val(),
            type: $("#velgVareType").val()
        }
    }
    $.post("/lagreVare", vare, ()=>{
        vareLagtTil()
    })
}

const vareLagtTil = () =>{
    fjernValg()
}

const fjernValg = () => {
    $("#vareSkjema").find("div:gt(0)").remove()
    $("#vareSkjema").find("button").remove()
}