const express = require('express');

const app = express()

app.get('/index.html',
(req, res) =>
{
    res.sendFile(__dirname +"/form.html");
    let rota = req.query;
    const dev = 
    {   
        nome: rota['nome'],
        sobrenome: rota['sobrenome'],
        email: rota['email'],
        devweb: rota['devweb'],
        tecnologia: 
        [
            rota['tecnologia1'],
            rota['tecnologia2'],
            rota['tecnologia3'],
            rota['tecnologia4'],
            rota['tecnologia5'], 
            rota['tecnologia6'],
            rota['tecnologia7']
        ]

    }
    res.sendFile(__dirname + "index.html", dev);

});

app.listen(5500, () => {
    console.log("servidor criado");
});