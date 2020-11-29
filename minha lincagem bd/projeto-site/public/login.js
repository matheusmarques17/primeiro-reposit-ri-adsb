function entrar() {
    var formulario = new URLSearchParams(new FormData(form_login));
    fetch("/usuarios/autenticar", {
        method: "POST",
        body: formulario
    }).then(resposta => {

        if (resposta.ok) {

            resposta.json().then(json => {

                sessionStorage.login_usuario_meuapp = json.login;
                sessionStorage.nome_usuario_meuapp = json.nome;

                window.location.href = 'index.html';
                alert ('Bem vindo');
            });

        } else {


            console.log('Erro de login!');

            alert ('Usuário ou Senha inválidos');
            login.value = "";
            senha1.value = "";
        }
    });

    return false;

}