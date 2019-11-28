<%-- 
    Document   : ger-frotas
    Created on : 28/11/2019, 01:27:18
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
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection" />
  <link href="css/backuse.css" type="text/css" rel="stylesheet" media="screen,projection" />
</head>

<body>
  <header>
    <nav class="nav-extended grey darken-1">
      <!-- <div class="nav-wrapper grey darken-2">
                  <div class="container">
                <a href="index.html" class="brand-logo"><img src="img/logo.svg" width="120"></a>
                  <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
                  <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li class="active"><a href="ger-frotas.html">Gerenciamento de Frotas</a></li>
                    <li><a href="est-pecas.html">Estoque Peças</a></li>
                    <li><a href="loc-veiculos.html">Locação</a></li>
                    <li><a href="financeiro.html">Financeiro e relatórios</a></li>
                    <li><a href="manutencao.html">Manutenção</a></li>
                    <li><a href="mul-sini.html">Multas e Sinistros</a></li>
                  </ul>
                </div>
              </div> -->

      <ul id="Cadastros" class="dropdown-content">
        <li><a href="#!">Motoristas</a></li>
        <li><a href="#!">Veículos</a></li>
        <li><a href="#!">Viagem</a></li>
        <li class="divider"></li>
        <li><a href="#!">Peças</a></li>
        <li><a href="#!">Mecanicos</a></li>
      </ul>
      <nav>
        <div class="nav-wrapper">
          <a href="#!" class="brand-logo">Logo</a>
          <ul class="right hide-on-med-and-down">
            <li><a class="dropdown-trigger" href="#!" data-target="Cadastros">Cadastros<i
                  class="material-icons right">arrow_drop_down</i></a></li>
            <li><a href="sass.html">Locação</a></li>
            <li><a href="badges.html">Relatórios</a></li>
            <li><a href="badges.html">Financeiro</a></li>
            <li><a href="badges.html">Multas e Sinistros</a></li>
          </ul>
        </div>
      </nav>

      <ul class="sidenav" id="mobile-demo">
        <li class="active"><a href="ger-frotas.html">Gerenciamento de Frotas</a></li>
        <li><a href="est-pecas.html">Estoque Peças</a></li>
        <li><a href="loc-veiculos.html">Locação</a></li>
        <li><a href="financeiro.html">Financeiro e relatórios</a></li>
        <li><a href="manutencao.html">Manutenção</a></li>
        <li><a href="mul-sini.html">Multas e Sinistros</a></li>
      </ul>
    </nav>
  </header>
  <br><br>
  <div class="container">
    <ul class="collapsible">
      <li>
        <div class="collapsible-header"><i class="material-icons">face</i>Cadastrar Motorista
          &nbsp;&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
          <span> <a class="btn blue modal-trigger right" href="#modal1"><b>&emsp;Consultar Motoristas
                cadastrados&emsp;</b></a> </span>
        </div>
        <div class="collapsible-body grey lighten-4">

          <form>
            <div class="row">
              <div class="input-field col s12 l3">
                <input id="CD_MOTORISTA" type="text" class="validate">
                <label for="CD_MOTORISTA">Código do Motorista</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l6">
                <input id="Nome" type="text" class="validate">
                <label for="Nome">Nome</label>
              </div>
              <div class="input-field col s12 l6">
                <input id="Sobrenome" type="text" class="validate">
                <label for="Sobrenome">Sobrenome</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l6">
                <input id="cpf" placeholder="XXX.XXX.XXX-XX" type="text" class="validate">
                <label for="cpf">CPF</label>
              </div>
              <div class="input-field col s12 l3">
                <input type="text" placeholder="XX.XXX.XXX-X" class="validate" id="RG">
                <label for="RG">RG</label>
              </div>
              <div class="input-field col s12 l3">
                <input type="text" placeholder="____/____/________" class="datepicker" id="Data">
                <label for="Data">Data de Nascimento</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l3">
                <input type="radio">
                <form action="#">
                  <p>Sexo</p>
                  <p>
                    <label>
                      <input name="group1" type="radio" checked />
                      <span>Masculino</span>
                    </label>
                  </p>
                  <p>
                    <label>
                      <input name="group1" type="radio" />
                      <span>Feminino</span>
                    </label>
                  </p>
              </div>
              <div class="input-field col s12 l6">
                <input type="text" placeholder="XXXXXXXXXXX" class="validate" id="CNH">
                <label for="CNH">Número da CNH (11 digitos) </label>
              </div>
              <div class="input-field col s12 l3">
                <input type="text" placeholder="____/____/________" class="datepicker" id="Data">
                <label for="Data">Vencimento da CNH</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input id="Nome" type="text" placeholder="Observações do Motorista">
                <label for="Nome">Observações</label>
              </div>
            </div>
            <div class="row">
              <div class="col s12">
                <button class="right btn waves-effect waves-light" type="submit" name="action"
                  onclick="cadastrook()">Cadastrar
                  <i class="material-icons right">send</i>
                </button>
              </div>
            </div>
          </form>
        </div>
      </li>
      <li>
        <div class="collapsible-header"><i class="material-icons">directions_car</i>Cadastrar Veículos
          &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
          <span> <a class="btn blue modal-trigger" href="#modal2"><b>&emsp;Consultar Veículos cadastrados&emsp;</b></a>
          </span>
        </div>
        <div class="collapsible-body grey lighten-4">
          <form>
            <div class="row">
              <div class="input-field col s12 l3">
                <input id="CD_VEICULO" type="text" class="validate">
                <label for="CD_VEICULO">Código do Veículo</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l6">
                <input id="marca" type="text" class="validate">
                <label for="marca">Marca do Veículo</label>
              </div>
              <div class="input-field col s12 l6">
                <input id="modelo" type="text" class="validate">
                <label for="modelo">Modelo do Veículo</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l6">
                <input id="cor" type="text" class="validate">
                <label for="cor">Cor do veículo</label>
              </div>
              <div class="input-field col s12 l3">
                <input id="placa" type="text" class="validate">
                <label for="placa">Placa do Veículo</label>
              </div>
              <div class="input-field col s12 l3">
                <input id="hodom" type="number" class="validate">
                <label for="hodom">Hodômetro(KM)</label>
              </div>
            </div>

            <div class="row">
              <div class="input-field col s12 l6">
                <p class="range-field">
                  <label for="anofab">Ano - Fabricação</label>
                  <input type="range" id="anofab" min="2000" max="2020" />
                </p>
              </div>
              <div class="input-field col s12 l6">
                <p class="range-field">
                  <label for="anomod">Ano - Modelo</label>
                  <input type="range" id="anomod" min="2000" max="2020" />
                </p>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l3">
                <select>
                  <option value="" disabled selected>Tipo de Veículo</option>
                  <option value="moto">Motocicleta</option>
                  <option value="carro">Automóvel</option>
                  <option value="caminhao">Caminhão</option>
                </select>
              </div>
              <div class="input-field col s12 l3">
                <select>
                  <option value="" disabled selected>Disponibilidade</option>
                  <option value="disp">Disponível</option>
                  <option value="indisp">Indisponível</option>
                  <option value="viagem">Em Viagem</option>
                  <option value="manut">Em Manutenção</option>
                </select>
              </div>
              <div class="input-field col s12 l3">
                <select>
                  <option value="" disabled selected>Seguradora</option>
                  <option value="porto">Porto Seguro</option>
                  <option value="azul">Azul</option>
                  <option value="sula">Sulamérica</option>
                </select>
              </div>
              <div class="input-field col s12 l3">
                <input id="apolice" type="number" class="validate">
                <label for="apolice">Número da Apólice</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input id="Observações" type="number" class="validate">
                <label for="Observações">Observações</label>
              </div>
            </div>
            <div class="row">
              <div class="col s12">
                <button class="right btn waves-effect waves-light" type="submit" name="action"
                  onclick="cadastrook()">Cadastrar
                  <i class="material-icons right">send</i>
                </button>
              </div>
            </div>
          </form>
        </div>
      </li>
      <li>
        <div class="collapsible-header"><i class="material-icons">map</i>Cadastrar Viagem
          &nbsp;&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
          <span> <a class="btn blue modal-trigger" href="#modal3"><b>&emsp;Consultar Viagens
                cadastradas&emsp;</b></a></span>
        </div>
        <div class="collapsible-body grey lighten-4">
          <form>
            <div class="row">
              <div class="input-field col s12 l3">
                <input id="CD_MOTORISTA_VIAGEM FK" type="number" class="validate">
                <label for="CD_MOTORISTA_VIAGEM FK">Código do Motorista</label>
              </div>
              <div class="input-field col s12 l3">
                <input id="CD_VEICULO_VIAGEM FK" type="text" class="validate">
                <label for="CD_VEICULO_VIAGEM FK">Código do Veículo</label>
              </div>
              <div class="input-field col s12 l3">
                <input id="CD_VIAGEM" type="number" class="validate">
                <label for="CD_VIAGEM">Código da Viagem</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l9">
                <input id="ORIGEM_VIAGEM" type="text" class="validate">
                <label for="ORIGEM_VIAGEM">Cidade Origem</label>
              </div>
              <div class="input-field col s12 l3">
                <input id="EST_ORIGEM_VIAGEM" type="text">
                <label for="EST_ORIGEM_VIAGEM">UF Origem</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l9">
                <input id="DEST_VIAGEM" type="text" class="validate">
                <label for="DEST_VIAGEM">Cidade Destino</label>
              </div>
              <div class="input-field col s12 l3">
                <input id="EST_DEST_VIAGEM" type="text">
                <label for="EST_DEST_VIAGEM">UF Destino</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l3">
                <input id="KM_VIAGEM" type="number" class="validate">
                <label for="KM_VIAGEM">Distância Viagem (KM)</label>
              </div>
              <div class="input-field col s12 l3">
                <select id="TIPO_VIAGEM">
                  <option value="" disabled selected>Tipo de Viagem</option>
                  <option value="ch_tecn">Chamado Técnico</option>
                  <option value="ch_manutprev">Manutenção Preventiva</option>
                  <option value="ch_outros">Outros</option>
                </select>
              </div>
              <div class="input-field col s12 l6">
                <input id="motivo_viagem" type="text" class="validate">
                <label for="motivo_viagem">Motivo da Viagem</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12 l3">
                <input id="VALOR_VIAGEM" type="number" class="validate">
                <label for="VALOR_VIAGEM">Valor da Viagem</label>
              </div>
              <div class="input-field col s12 l9">
                <input id="OBS_VIAGEM" type="text">
                <label for="OBS_VIAGEM">Observações</label>
              </div>
            </div>
            <div class="row">
              <div class="col s12">
                <button class="right btn waves-effect waves-light" type="submit" name="action"
                  onclick="cadastrook()">Cadastrar
                  <i class="material-icons right">send</i>
                </button>
              </div>
            </div>
          </form>
        </div>
      </li>
    </ul>
  </div>


  <div id="modal1" class="modal">
    <div class="modal-content">
      <h4>Consulta Motoristas</h4>
      <table class="centered responsive-table highlight">
        <thead>
          <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>CPF</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>0001</td>
            <td>Dave Mustaine</td>
            <td>651.561.165-51</td>
          </tr>
          <tr>
            <td>0002</td>
            <td>Angus Young</td>
            <td>666.584.658-88</td>
          </tr>
          <tr>
            <td>0003</td>
            <td>James Hetfield</td>
            <td>937.477.124-66</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="modal-footer">
      <a class="btn blue waves-green erro-bt" onclick="errobt()"> Consultar</a>
      <a class="btn green waves-green erro-bt" onclick="errobt()">Editar</a>
      <a href="#!" class="btn modal-close waves-effect red">fechar</a>
    </div>
  </div>

  <div id="modal2" class="modal">
    <div class="modal-content">
      <h4>Consulta Veículos</h4>
      <table class="centered responsive-table highlight">
        <thead>
          <tr>
            <th>Código</th>
            <th>Placa</th>
            <th>Marca</th>
            <th>Veículo</th>
            <th>Ano Fab/Mod</th>
            <th>Hodômetro (KM)</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>aut0001</td>
            <td>DIZ-5175</td>
            <td>Ford</td>
            <td>Ka</td>
            <td>2002 / 2003</td>
            <td>245154</td>
          </tr>
          <tr>
            <td>mot0001</td>
            <td>WPH-1569</td>
            <td>Dafra</td>
            <td>Speed 150 Cargo</td>
            <td>2007 / 2008</td>
            <td>65484</td>
          </tr>
          <tr>
            <td>cam0001</td>
            <td>IOS-6877</td>
            <td>Iveco</td>
            <td>Daily 35S14</td>
            <td>2006 / 2006</td>
            <td>287755</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="modal-footer">
      <a class="btn blue waves-green erro-bt" onclick="errobt()"> Consultar</a>
      <a class="btn green waves-green erro-bt" onclick="errobt()">Editar</a>
      <a href="#!" class="btn modal-close waves-effect red">fechar</a>
    </div>
  </div>

  <div id="modal3" class="modal">
    <div class="modal-content">
      <h4>Consulta Viagens</h4>
      <table class="centered responsive-table highlight">
        <thead>
          <tr>
            <th>Código da Viagem</th>
            <th>Cidade Origem</th>
            <th>UF Origem</th>
            <th>Cidade Destino</th>
            <th>UF Destino</th>
            <th>Distância (KM)</th>
            <th>Valor da Viagem (R$)</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>000001</td>
            <td>São Paulo</td>
            <td>SP</td>
            <td>Lavras</td>
            <td>MG</td>
            <td>376</td>
            <td>488,80</td>
          </tr>
          <tr>
            <td>000002</td>
            <td>São Paulo</td>
            <td>SP</td>
            <td>Rio de Janeiro</td>
            <td>RJ</td>
            <td>442</td>
            <td>574,60</td>
          </tr>
          <tr>
            <td>000001</td>
            <td>São Paulo</td>
            <td>SP</td>
            <td>Balneário Camporiú</td>
            <td>SC</td>
            <td>625</td>
            <td>812,50</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="modal-footer">
      <a class="btn blue waves-green erro-bt" onclick="errobt()"> Detalhes</a>
      <a class="btn green waves-green erro-bt" onclick="errobt()">Editar</a>
      <a href="#!" class="btn modal-close waves-effect red">fechar</a>
    </div>
  </div>

  <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
  <script type="text/javascript" src="js/materialize.min.js"></script>
  <script type="text/javascript" src="js/inite.js"></script>
</body>

</html>