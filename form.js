const express = require('express');

const app = express()

app.get('/form.html',
(req, res) =>
{
    res.sendFile(__dirname +"/form.html");
    let rota = req.query;
    const obj = 
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
});



app.listen(5500, () => {
    console.log("servidor criado");
});