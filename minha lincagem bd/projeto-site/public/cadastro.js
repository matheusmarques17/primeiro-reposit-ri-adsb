

    function cadastrar() {
        var formulario = new URLSearchParams(new FormData(form_cadastro));
        fetch("/usuarios/cadastrar", {
            method: "POST",
            body: formulario
        }).then(function (response) {

            if (response.ok) {


                window.location.href='index.html';
                alert ('Cadastro realizado com sucesso');

            } else {

                console.log('Erro de cadastro!');
                response.text().then(function (resposta) {
                    div_erro.innerHTML = resposta;
                });
            }
        });

        return false;
    }