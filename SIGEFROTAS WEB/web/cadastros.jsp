<%-- 
    Document   : cadastros
    Created on : 28/11/2019, 01:24:01
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/materialize.min.css">
</head>

<body>
    <header>
        <img src="img/png/logoFundo.png" alt="logo">
        <ul>
            <li><a href="#"><img src="img/svg/cadastros.svg" alt="cadastros"></a></li>
            <li><a href="#"><img src="img/svg/gerFrotas.svg" alt="Gerenciamento de Frotas"></a></li>
            <li><a href="#"><img src="img/svg/locacao.svg" alt="Locação de Veículos"></a></li>
            <li><a href="#"><img src="img/svg/financeiro.svg" alt="Financeiro"></a></li>
            <li><a href="#"><img src="img/svg/comprasAbaste.svg" alt="Compras e Abastecimentos"></a></li>
            <li><a href="#"><img src="img/svg/manutencao.svg" alt="Manutenção"></a></li>
        </ul>
    </header>
    <div class="cadastrosBar"></div>
    <div class="list">
        <table>
            <tr>
                <td>Cadastro Motorista</td>
                <td>Cadastro Veículo</td>
                <td>Cadastro Viagem</td>
                <td>Cadastro Aluguel</td>
                <td>Cadastro Peças</td>
                <td>Cadastro Multas e Sinistros</td>
            </tr>
            <tr>
                <td><button type="button" onclick="popOpen('#CadMotorista')">Incluir</button></td>
                <td><button type="button">Incluir</button></td>
                <td><button type="button">Incluir</button></td>
                <td><button type="button">Incluir</button></td>
                <td><button type="button">Incluir</button></td>
                <td><button type="button">Incluir</button></td>
            </tr>
            <tr>
                <td><button type="button">Consultar</button></td>
                <td><button type="button">Consultar</button></td>
                <td><button type="button">Consultar</button></td>
                <td><button type="button">Consultar</button></td>
                <td><button type="button">Consultar</button></td>
                <td><button type="button">Consultar</button></td>
            </tr>
        </table>
    </div>


    <!--telas de cadastros-->

    <!-- cadastro motorista -->
    <div class="overlay" id="CadMotorista">
        <span onclick="popOpen('#CadMotorista')">X</span>
        <form class="wrapper">
            <h4>Cadastro de Motoristas</h4>
            <section class="row">
                <label class="col s4">Código do Motorista
                    <input type="text" name="CD_MOTORISTA" id="CD_MOTORISTA">
                </label>
            </section>
            <section class="row">
                <label class="col s5">Nome
                    <input type="text" name="NM_MOTORISTA" id="NM_MOTORISTA">
                </label>
                <label class="col s4">Telefone
                    <input type="tel" name="TEL_MOTORISTA" id="TEL_MOTORISTA">
                </label>
            </section>
            <section class="row">
                <label class="col s4">CPF
                    <input type="number" name="CPF_MOTORISTA" id="CPF_MOTORISTA">
                </label>
                <label class="col s4">RG
                    <input type="number" name="RG_MOTORISTA" id="RG_MOTORISTA">
                </label>
                <label class="col s4">Data de Nascimento
                    <input type="date" name="DT_NASC_MOTORISTA" id="DT_NASC_MOTORISTA">
                </label>
            </section>
            <section class="row">
                <label class="col s4">Sexo
                    <select name="SX_MOTORISTA" id="SX_MOTORISTA">
                        <option value="Masculino">Masculino</option>
                        <option value="Feminino">Feminino</option>
                    </select>
                </label>
                <label class="col s4">Número de CNH
                    <input type="number" name="CNH_MOTORISTA" id="CNH_MOTORISTA">
                </label>
                <label class="col s4">Vencimento CNH
                    <input type="date" name="VAL_CNH_MOTORISTA" id="VAL_CNH_MOTORISTA">
                </label>
            </section>
            <section class="row">
                <label class="col s12">Observações
                    <textarea name="OBS_MOTORISTA" id="OBS_MOTORISTA"></textarea>
                </label>
            </section>
            <button type="button" class="waves-effect waves-light btn limpaCampos blue darken-4">Limpar</button>
            <button type="button" class="waves-effect waves-light btn cancelarInput right blue darken-4">Cancelar</button>
            <button type="button" class="waves-effect waves-light btn SalvarDados right blue darken-4">Salvar</button>
        </form>
    </div>

    <!-- cadastro veículo -->
    <div class="overlay" id="cadVeiculo">
        <span onclick="popOpen('#cadVeiculo');" class="close"></span>
        <form class="wrapper">
            <h1>Cadastro de Veículos</h1>
            <section class="row">
                <label>Código do Veículo
                    <input type="text" name="CD_VEICULO" id="CD_VEICULO">
                </label>
                <label>Veículo Prórpio
                    <input type="checkbox" name="VEICULO_PROPRIO" id="VEICULO_PROPRIO">
                </label>
            </section>
            <section class="row">
                <label>Marca do Veículo
                    <input type="text" name="MARCA_VEICULO" id="MARCA_VEICULO">
                </label>
                <label>Modelo do Veículo
                    <input type="text" name="MODELO_VEICULO" id="MODELO_VEICULO">
                </label>
            </section>
            <section class="row">
                <label>Cor do Veículo
                    <input type="text" name="COR_VEICULO" id="COR_VEICULO">
                </label>
                <label>Placa do Veíclo
                    <input type="text" name="PLACA_VEICULO" id="PLACA_VEICULO">
                </label>
                <label>Hodômetro (KM)
                    <input type="number" name="HODOM_VEICULO" id="HODOM_VEICULO">
                </label>
            </section>
            <section class="row">
                <label>Ano Fabricação
                    <input type="number" name="ANO_VEICULO" id="ANO_VEICULO">
                </label>
                <label>Ano Modelo
                    <input type="number" name="ANO_MOD_VEICULO" id="ANO_MOD_VEICULO">
                </label>
            </section>
            <section class="row">
                <label>Tipo do Veículo
                    <input type="number" name="TIPO_VEICULO" id="TIPO_VEICULO">
                </label>
                <label>Disponibilidade
                    <input type="number" name="DISPO_VEICULO" id="DISPO_VEICULO">
                </label>
                <label>Seguradora
                    <input type="number" name="SEGURO_VEICULO" id="SEGURO_VEICULO">
                </label>
                <label>Número de Apólice
                    <input type="number" name="NUM_APOLICE_VEICULO" id="NUM_APOLICE_VEICULO">
                </label>
            </section>
            <section class="row">
                <label>Observações
                    <textarea name="OBS_VEICULO" id="OBS_VEICULO"></textarea>
                </label>
            </section>
            <button type="button" class="limpaCampos">Limpar</button>
            <button type="button" class="cancelarInput">Cancelar</button>
            <button type="button" class="SalvarDados">Salvar</button>
        </form>
    </div>

    <!-- cadastro viagem -->
    <div class="overlay" id="CadViagem">
        <span onclick="popOpen('#CadViagem');" class="close"></span>
        <form class="container" action="get">
            <h1>Cadastro de Viagem</h1>
            <section class="row">
                <label>Código da Viagem
                    <input type="number" name="CD_VEICULO" id="CD_VEICULO">
                </label>
                <label>Motorista
                    <select name="" id=""></select>
                </label>
                <label>Veiculo
                    <select name="" id=""></select>
                </label>
            </section>
            <section class="row">
                <label>Cidade Origem
                    <input type="text" name="MARCA_VEICULO" id="MARCA_VEICULO">
                </label>
                <label>UF Origem
                    <select id="estado" name="estado">
                        <option value="AC">Acre</option>
                        <option value="AL">Alagoas</option>
                        <option value="AP">Amapá</option>
                        <option value="AM">Amazonas</option>
                        <option value="BA">Bahia</option>
                        <option value="CE">Ceará</option>
                        <option value="DF">Distrito Federal</option>
                        <option value="ES">Espírito Santo</option>
                        <option value="GO">Goiás</option>
                        <option value="MA">Maranhão</option>
                        <option value="MT">Mato Grosso</option>
                        <option value="MS">Mato Grosso do Sul</option>
                        <option value="MG">Minas Gerais</option>
                        <option value="PA">Pará</option>
                        <option value="PB">Paraíba</option>
                        <option value="PR">Paraná</option>
                        <option value="PE">Pernambuco</option>
                        <option value="PI">Piauí</option>
                        <option value="RJ">Rio de Janeiro</option>
                        <option value="RN">Rio Grande do Norte</option>
                        <option value="RS">Rio Grande do Sul</option>
                        <option value="RO">Rondônia</option>
                        <option value="RR">Roraima</option>
                        <option value="SC">Santa Catarina</option>
                        <option value="SP">São Paulo</option>
                        <option value="SE">Sergipe</option>
                        <option value="TO">Tocantins</option>
                    </select>
                </label>
            </section>
            <section class="row">
                <label>Cidade Destino
                    <input type="text" name="MARCA_VEICULO" id="MARCA_VEICULO">
                </label>
                <label>UF Destino
                    <select id="estado" name="estado">
                        <option value="AC">Acre</option>
                        <option value="AL">Alagoas</option>
                        <option value="AP">Amapá</option>
                        <option value="AM">Amazonas</option>
                        <option value="BA">Bahia</option>
                        <option value="CE">Ceará</option>
                        <option value="DF">Distrito Federal</option>
                        <option value="ES">Espírito Santo</option>
                        <option value="GO">Goiás</option>
                        <option value="MA">Maranhão</option>
                        <option value="MT">Mato Grosso</option>
                        <option value="MS">Mato Grosso do Sul</option>
                        <option value="MG">Minas Gerais</option>
                        <option value="PA">Pará</option>
                        <option value="PB">Paraíba</option>
                        <option value="PR">Paraná</option>
                        <option value="PE">Pernambuco</option>
                        <option value="PI">Piauí</option>
                        <option value="RJ">Rio de Janeiro</option>
                        <option value="RN">Rio Grande do Norte</option>
                        <option value="RS">Rio Grande do Sul</option>
                        <option value="RO">Rondônia</option>
                        <option value="RR">Roraima</option>
                        <option value="SC">Santa Catarina</option>
                        <option value="SP">São Paulo</option>
                        <option value="SE">Sergipe</option>
                        <option value="TO">Tocantins</option>
                    </select>
                </label>
            </section>
            <section class="row">
                <label class="col">Ano Fabricação
                    <input type="number" name="ANO_VEICULO" id="ANO_VEICULO">
                </label>
                <label>Ano Modelo
                    <input type="number" name="ANO_MOD_VEICULO" id="ANO_MOD_VEICULO">
                </label>
            </section>
            <section class="row">
                <label>Tipo do Veículo
                    <input type="number" name="TIPO_VEICULO" id="TIPO_VEICULO">
                </label>
                <label>Disponibilidade
                    <input type="number" name="DISPO_VEICULO" id="DISPO_VEICULO">
                </label>
                <label>Seguradora
                    <input type="number" name="SEGURO_VEICULO" id="SEGURO_VEICULO">
                </label>
                <label>Número de Apólice
                    <input type="number" name="NUM_APOLICE_VEICULO" id="NUM_APOLICE_VEICULO">
                </label>
            </section>
            <section class="row">
                <label>Observações
                    <textarea name="OBS_VEICULO" id="OBS_VEICULO"></textarea>
                </label>
            </section>
            <button type="button" class="limpaCampos">Limpar</button>
            <button type="button" class="cancelarInput">Cancelar</button>
            <button type="submit" class="SalvarDados">Salvar</button>
        </form>
    </div>
</body>

<script src="js/jquery-3.4.1.js" type="text/javascript"></script>
<script src="js/global.js" type="text/javascript"></script>
</html>
