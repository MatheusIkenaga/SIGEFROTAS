<%-- 
    Document   : financeiro
    Created on : 28/11/2019, 01:25:47
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8"/>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="copyright" content="© 2019 SIGEFROTAS - Sistema de Gestão de Frotas e Locação de Veículos"/>
  <meta name="robots" content="index, follow"/>

  <title>SIGEFROTAS</title>

  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="css/backuse.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body>
  <header>
        <nav class="nav-extended grey darken-1">
                <div class="nav-wrapper grey darken-2">
                  <div class="container">
                <a href="index.html" class="brand-logo"><img src="img/logo.svg" width="120"></a>
                  <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
                  <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="ger-frotas.html">Gerenciamento de Frotas</a></li>
                    <li><a href="est-pecas.html">Estoque Peças</a></li>
                    <li><a href="loc-veiculos.html">Locação</a></li>
                    <li class="active"><a href="financeiro.html">Financeiro e relatórios</a></li>
                    <li><a href="manutencao.html">Manutenção</a></li>
                    <li><a href="mul-sini.html">Multas e Sinistros</a></li>
                  </ul>
                </div>
              </div>
              
                      
              <ul class="sidenav" id="mobile-demo">
                  <li><a href="ger-frotas.html">Gerenciamento de Frotas</a></li>
                  <li><a href="est-pecas.html">Estoque Peças</a></li>
                  <li><a href="loc-veiculos.html">Locação</a></li>
                  <li class="active"><a href="financeiro.html">Financeiro e relatórios</a></li>
                  <li><a href="manutencao.html">Manutenção</a></li>
                  <li><a href="mul-sini.html">Multas e Sinistros</a></li>
              </ul>
              </nav>
  </header>
  <br><br>
  <div class="container">
              <ul class="collapsible">
                  <li>
                    <div class="collapsible-header"><i class="material-icons">record_voice_over</i>Viagens
                    </div>
                    <div class="collapsible-body grey lighten-4">
                                <div class="row">
                                    <div class="col s12 m12 l7">
                                        <table class="responsive-table highlight">
                                            <thead>
                                              <tr>
                                                  <th>Código da Viagem</th>
                                                  <th>Motorista</th> 
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
                                                <td>Angus Young</td>
                                                <td>São Paulo</td>
                                                <td>SP</td>
                                                <td>Lavras</td>
                                                <td>MG</td>
                                                <td>376</td>
                                                <td>488,80</td>
                                              </tr>
                                              <tr>
                                                  <td>000002</td>
                                                  <td>Dave Mustaine</td>
                                                  <td>São Paulo</td>
                                                  <td>SP</td>
                                                  <td>Rio de Janeiro</td>
                                                  <td>RJ</td>
                                                  <td>442</td>
                                                  <td>574,60</td>
                                              </tr>
                                              <tr>
                                                  <td>000001</td>
                                                  <td>James Hetfield</td>
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
                                    <div class="center col s12 m12 l5">
                                      <div id="piechart" style="width: 100%"></div>
                                    </div>
                                  </div>
                                  <div class="row">
                                      <div class="col s12">
                                        <button class="btn waves-effect waves-light" type="submit" name="action" onclick="errobt()">detalhes
                                        </button>
                                        <button class="btn waves-effect waves-light" type="submit" name="action" onclick="errobt()">editar
                                            </button>
                                      </div>
                                    </div>   
                      </div>
                  </li>                  <li>
                      <div class="collapsible-header"><i class="material-icons">time_to_leave</i>Locação
                      </div>
                      <div class="collapsible-body grey lighten-4">
                                  <div class="row">
                                      <div class="col s12 m12 l9">
                                          <table class="responsive-table highlight">
                                              <thead>
                                                <tr>
                                                    <th>Código da Locação</th>
                                                    <th>Motorista</th> 
                                                    <th>Veículo</th>
                                                    <th>Placa do Veículo</th>
                                                    <th>Data Locação</th>
                                                    <th>Data Devolução</th>
                                                </tr>
                                              </thead>
                                      
                                              <tbody>
                                                <tr>
                                                  <td>loca00001</td>
                                                  <td>Angus Young</td>
                                                  <td>Peugeot 208</td>
                                                  <td>ELY-2131</td>
                                                  <td>12/02/2019</td>
                                                  <td>12/03/2019</td>
                                                </tr>
                                                <tr>
                                                    <td>loca00002</td>
                                                    <td>Dave Mustaine</td>
                                                    <td>Renault Kwid</td>
                                                    <td>GRE-2565</td>
                                                    <td>25/03/2019</td>
                                                    <td>25/08/2019</td>
                                                </tr>
                                                <tr>
                                                    <td>loca00003</td>
                                                    <td>James Hetfield</td>
                                                    <td>Renault Sandero</td>
                                                    <td>GRO-0715</td>
                                                    <td>14/05/2019</td>
                                                    <td>28/05/2019</td>
                                                </tr>
                                              </tbody>
                                            </table>
                                      </div>
                                      <div class="center col s12 m12 l3">
                                        <img src="img/graf-loc.svg" alt="locação"/>
                                      </div>
                                    </div>
                                    <div class="row">
                                        <div class="col s12">
                                          <button class="btn waves-effect waves-light" type="submit" name="action" onclick="errobt()">detalhes
                                          </button>
                                          <button class="btn waves-effect waves-light" type="submit" name="action" onclick="errobt()">editar
                                              </button>
                                        </div>
                                      </div>   
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header"><i class="material-icons">note</i>Multas e Sinistros
                        </div>
                        <div class="collapsible-body grey lighten-4">
                            <div class="row">
                            <div class="col s12"> <p>Multas</p>
                                <table class="responsive-table highlight">
                                    <thead>
                                      <tr>
                                          <th>Veículo</th>
                                          <th>Motorista</th> 
                                          <th>Data da Multa</th>
                                          <th>Placa do Veículo</th>
                                          <th>Local da Multa</th>
                                          <th>Valor da Multa</th>
                                      </tr>
                                    </thead>
                            
                                    <tbody>
                                      <tr>
                                        <td>Peugeot 208</td>
                                        <td>Angus Young</td>
                                        <td>12/02/2019</td>
                                        <td>ELY-2131</td>
                                        <td>São Paulo</td>
                                        <td>237,00</td>
                                      </tr>
                                      <tr>
                                          <td>Renault Kwid</td>
                                          <td>Dave Mustaine</td>
                                          <td>12/02/2019</td>
                                          <td>GRO-0715</td>
                                          <td>São Paulo</td>
                                          <td>175,00</td>
                                      </tr>
                                      <tr>
                                          <td>Peugeot 208</td>
                                          <td>Angus Young</td>
                                          <td>12/03/2019</td>
                                          <td>ELY-2131</td>
                                          <td>São Paulo</td>
                                          <td>237,00</td>
                                      </tr>
                                    </tbody>
                                  </table>
                            </div></div>
                            <div class="row">
                              <div class="col s12">
                                <button class="btn waves-effect waves-light" type="submit" name="action" onclick="errobt()">detalhes
                                </button>
                              </div>
                              </div>
                            <div class="row">
                                <div class="col s12"><p>SINISTROS</p>
                                    <table class="responsive-table highlight">
                                        <thead>
                                          <tr>
                                              <th>Veículo</th>
                                              <th>Motorista</th> 
                                              <th>Data da Multa</th>
                                              <th>Placa do Veículo</th>
                                              <th>Local do sinistro</th>
                                              <th>Tipo de Sinistro</th>
                                          </tr>
                                        </thead>
                                
                                        <tbody>
                                          <tr>
                                            <td>Peugeot 208</td>
                                            <td>Angus Young</td>
                                            <td>12/02/2019</td>
                                            <td>ELY-2131</td>
                                            <td>São Paulo</td>
                                            <td>Roubo</td>
                                          </tr>
                                          <tr>
                                              <td>Renault Kwid</td>
                                              <td>Dave Mustaine</td>
                                              <td>12/02/2019</td>
                                              <td>GRO-0715</td>
                                              <td>São Paulo</td>
                                              <td>Acidente</td>
                                          </tr>
                                          <tr>
                                              <td>Peugeot 208</td>
                                              <td>Angus Young</td>
                                              <td>12/03/2019</td>
                                              <td>ELY-2131</td>
                                              <td>São Paulo</td>
                                              <td>Acidente</td>
                                          </tr>
                                        </tbody>
                                      </table>
                                </div>
                              </div>
                              <div class="row">
                                  <div class="col s12">
                                    <button class="btn waves-effect waves-light" type="submit" name="action" onclick="errobt()">detalhes
                                    </button>
                                  </div>
                                  </div>
                                </div> 
                      </li>
                </ul>
              </div>


              <div id="modal1" class="modal">
                <div class="modal-content">
                  <h4>Consulta Peças Motor</h4>
                  <table class="centered responsive-table highlight">
                    <thead>
                      <tr>
                          <th>Código</th>
                          <th>Nome</th>
                          <th>quantidade</th>
                          <th>Valor R$</th>
                          <th>Observações</th>
                      </tr>
                    </thead>
            
                    <tbody>
                      <tr>
                        <td>pm00001</td>
                        <td>Filtro de Combustível Peugeot 207</td>
                        <td>12</td>
                        <td>R$19,80</td>
                        <td>Compatibilidade: Peugeot 207 Hatch 1.4 8(...)</td>
                      </tr>
                      <tr>
                          <td>pm00002</td>
                          <td>Kit de embreagem - Peugeot 207</td>
                          <td>4</td>
                          <td>R$411,00</td>
                          <td>Compatibilidade: Peugeot 207 Hatch 1.4 8(...)</td>
                      </tr>
                      <tr>
                          <td>pm00003</td>
                          <td>Sapata de freio traseiro (jogo) - Peugeot 207</td>
                          <td>36</td>
                          <td>R$65,50</td>
                          <td>Compatibilidade: Peugeot 207 Hatch 1.4 8(...)</td>
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
                    <h4>Consulta Pneus</h4>
                    <table class="centered responsive-table highlight">
                      <thead>
                        <tr>
                            <th>Código</th>
                            <th>Medida e Marca</th>
                            <th>quantidade</th>
                            <th>Valor R$</th>
                            <th>Observações</th>
                        </tr>
                      </thead>
              
                      <tbody>
                        <tr>
                          <td>pn00001</td>
                          <td>Pneu 175/65R14 Goodyear</td>
                          <td>8</td>
                          <td>R$212,25</td>
                          <td>Compatibilidade: Peugeot 207 Hatch 1.4 8(...)</td>
                        </tr>
                        <tr>
                            <td>pn00002</td>
                            <td>Pneu 195/55R15 Linglong</td>
                            <td>4</td>
                            <td>R$219,00</td>
                            <td>Compatibilidade: BRAVA, KA+, TEMPRA(..)</td>
                        </tr>
                        <tr>
                            <td>pn00003</td>
                            <td>Pneu 215/75R17,5 16 Lonas Goodride</td>
                            <td>6</td>
                            <td>R$499,00</td>
                            <td>Compatibilidade: Iveco Daily 35S14, Ag(..)</td>
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
                    <h4>Consulta peças lataria e acabamento</h4>
                    <table class="centered responsive-table highlight">
                      <thead>
                        <tr>
                            <th>Código</th>
                            <th>Peça e carro</th>
                            <th>quantidade</th>
                            <th>Valor R$</th>
                            <th>Observações</th>
                        </tr>
                      </thead>
              
                      <tbody>
                        <tr>
                          <td>pl00001</td>
                          <td>Grade do para-choque - Peugeot 207</td>
                          <td>1</td>
                          <td>R$91,70</td>
                          <td>Compatibilidade: Peugeot 207 Hatch 1.4 8(...)</td>
                        </tr>
                        <tr>
                            <td>pl00002</td>
                            <td>Para-lama dianteiro - Peugeot 207</td>
                            <td>1</td>
                            <td>R$198,00</td>
                            <td>Compatibilidade: Peugeot 207 Hatch 1.4 8(...)</td>
                        </tr>
                        <tr>
                            <td>pl00003</td>
                            <td>Farol de milha - Peugeot 207</td>
                            <td>6</td>
                            <td>R$151,00</td>
                            <td>Compatibilidade: Peugeot 207 Hatch 1.4 8(...)</td>
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

            <script type="text/javascript" src="js/materialize.min.js"></script>
            <script type="text/javascript" src="js/inite.js"></script>
            <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
            <script type="text/javascript" src="js/loader.js"></script>
</body>
</html>
