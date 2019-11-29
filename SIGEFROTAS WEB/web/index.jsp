<%-- 
    Document   : index
    Created on : 28/11/2019, 01:27:49
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="copyright" content="© 2019 SIGEFROTAS - Sistema de Gestão de Frotas e Locação de Veículos" />
  <meta name="robots" content="index, follow" />

  <title>SIGEFROTAS</title>

  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" />
  <link href="css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection" />
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection" />
  <link href="css/backuse.css" type="text/css" rel="stylesheet" media="screen,projection" />
</head>

<body>

  <header>
    <div class="nav-wrapper">
      <div class="container">
        <a href="index.jsp" class="brand-logo"><img src="img/logo.svg" width="120"></a>
        <ul class="right">
          <li><a href="configuracoes.jsp"><i class="small black-text material-icons">build</i></a></li>
        </ul>
      </div>
    </div>
  </header>

  <div class="valign-wrapper" style="width:100%; height:100%;">
    <div class="valign" style="width:100%;">
      <div class="container" id="div_menu" align="center">
        <div class="menu">
          <div class="row">
            <div class="col s12 m6 l4">
              <a href="ger-frotas.jsp"> <img src="img/ger_frota.svg" class="responsive-img" width="200px"></a>
            </div>

            <div class="col s12 m6 l4">
              <a href="est-pecas.jsp"> <img src="img/est_pecas.svg" class="responsive-img" width="200px"></a>
            </div>

            <div class="col s12 m6 l4">
              <a href="loc-veiculos.jsp"> <img src="img/loc_veiculos.svg" class="responsive-img" width="200px"></a>
            </div>

            <div class="col s12 m6 l4">
              <a href="financeiro.jsp"> <img src="img/financeiro.svg" class="responsive-img" width="200px"></a>
            </div>

            <div class="col s12 m6 l4">
              <a href="manutencao.jsp"> <img src="img/man_veiculos.svg" class="responsive-img" width="200px"></a>
            </div>

            <div class="col s12 m6 l4">
              <a href="mul-sini.jsp"> <img src="img/mul_sini.svg" class="responsive-img" width="200px"></a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>