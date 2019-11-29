<%-- 
    Document   : cadastros
    Created on : 28/11/2019, 23:33:48
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
                <td><button type="button" onclick="popOpen('#cadMotorista')">Incluir</button></td>
                <td><button type="button" onclick="popOpen('#cadVeiculo')">Incluir</button></td>
                <td><button type="button" onclick="popOpen('#cadViagem')">Incluir</button></td>
                <td><button type="button" onclick="popOpen('#cadAluguel')">Incluir</button></td>
                <td><button type="button" onclick="popOpen('#cadPecas')">Incluir</button></td>
                <td><button type="button" onclick="popOpen('#cadMultSin')">Incluir</button></td>
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
    <div class="overlay" id="cadMotorista">
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
                <label class="col s4">Sexo do Motorista
                    <select class="browser-default">
                        <option value="" disabled selected>Selecione</option>
                        <option value="masculino">Masculino</option>
                        <option value="feminino">Feminino</option>
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
            <button type="button" class="btn limpaCampos blue darken-4">Limpar</button>
            <button type="button" class="btn SalvarDados right blue darken-4">Salvar</button>
            <button type="button" class="btn cancelarInput right blue darken-4" onclick="popOpen('#cadMotorista')">Cancelar</button>
        </form>
    </div>

    <!-- cadastro veículo -->
    <div class="overlay" id="cadVeiculo">
        <form class="wrapper">
            <h4>Cadastro de Veículos</h4>
            <section class="row">
                <label class="col s4">Código do Veículo
                    <input type="text" name="CD_VEICULO" id="CD_VEICULO">
                </label>
                <label class="col s3 right">
                    <input type="checkbox" class="filled-in" name="VEICULO_PROPRIO" id="VEICULO_PROPRIO">
                    <span>Veículo Próprio</span>
                </label>
            </section>
            <section class="row">
                <label class="col s5">Marca do Veículo
                    <input type="text" name="MARCA_VEICULO" id="MARCA_VEICULO">
                </label>
                <label class="col s5">Modelo do Veículo
                    <input type="text" name="MODELO_VEICULO" id="MODELO_VEICULO">
                </label>
            </section>
            <section class="row">
                <label class="col s5">Cor do Veículo
                    <input type="text" name="COR_VEICULO" id="COR_VEICULO">
                </label>
                <label class="col s3">Placa do Veíclo
                    <input type="text" name="PLACA_VEICULO" id="PLACA_VEICULO">
                </label>
                <label class="col s4">Hodômetro (KM)
                    <input type="number" name="HODOM_VEICULO" id="HODOM_VEICULO">
                </label>
            </section>
            <section class="row">
                <label class="col s4">Ano Fabricação
                    <input type="number" name="ANO_VEICULO" id="ANO_VEICULO">
                </label>
                <label class="col s4 right">Ano Modelo
                    <input type="number" name="ANO_MOD_VEICULO" id="ANO_MOD_VEICULO">
                </label>
            </section>
            <section class="row">
                <label class="col s3">Tipo do Veículo
                    <input type="number" name="TIPO_VEICULO" id="TIPO_VEICULO">
                </label>
                <label class="col s3">Disponibilidade
                    <input type="number" name="DISPO_VEICULO" id="DISPO_VEICULO">
                </label>
                <label class="col s3">Seguradora
                    <input type="number" name="SEGURO_VEICULO" id="SEGURO_VEICULO">
                </label>
                <label class="col s3">Número de Apólice
                    <input type="number" name="NUM_APOLICE_VEICULO" id="NUM_APOLICE_VEICULO">
                </label>
            </section>
            <section class="row">
                <label>Observações
                    <textarea name="OBS_VEICULO" id="OBS_VEICULO"></textarea>
                </label>
            </section>
            <button type="button" class="btn limpaCampos blue darken-4">Limpar</button>
            <button type="submit" class="btn salvarDados limpaCampos blue darken-4 right">Salvar</button>
            <button type="button" class=" btn cancelarInput blue darken-4 right" onclick="popOpen('#cadVeiculo')">Cancelar</button>
        </form>
    </div>

    <!-- cadastro viagem -->
    <div class="overlay" id="cadViagem">
        <form class="wrapper">
            <h4>Cadastro de Viagem</h4>
            <section class="row">
                <label class="col s3">Código da Viagem
                    <input type="number" name="CD_VIAGEM" id="CD_VIAGEM" disabled>
                </label>
                <label class="col s5 middle">Motorista
                    <select class="browser-default" name="CD_MOTORISTA_VIAGEM" id="CD_MOTORISTA_VIAGEM"></select>
                </label>
                <label class="col s4">Veiculo
                    <select class="browser-default" name="CD_VEICULO_VIAGEM" id="CD_VEICULO_VIAGEM"></select>
                </label>
            </section>
            <section class="row">
                <label class="col s7">Cidade Origem
                    <input type="text" name="ORIGEM_VIAGEM" id="ORIGEM_VIAGEM">
                </label>
                <label class="col s5">UF Origem
                    <select class="browser-default" name="EST_ORIGEM_VIAGEM" id="EST_ORIGEM_VIAGEM">
                        <option value="" disabled selected>Selecione</option>
                        <option value="AC">AC - Acre</option>
                        <option value="AL">AL - Alagoas</option>
                        <option value="AM">AM - Amazonas</option>
                        <option value="AP">AP - Amapá</option>
                        <option value="BA">BA - Bahia</option>
                        <option value="CE">CE - Ceará</option>
                        <option value="DF">DF - Distrito Federal</option>
                        <option value="ES">ES - Espírito Santo</option>
                        <option value="GO">GO - Goiás</option>
                        <option value="MA">MA - Maranhão</option>
                        <option value="MG">MG - Minas Gerais</option>
                        <option value="MS">MS - Mato Grosso do Sul</option>
                        <option value="MT">MT - Mato Grosso</option>
                        <option value="PA">PA - Pará</option>
                        <option value="PB">PB - Paraíba</option>
                        <option value="PE">PE - Pernambuco</option>
                        <option value="PI">PI - Piauí</option>
                        <option value="PR">PR - Paraná</option>
                        <option value="RJ">RJ - Rio de Janeiro</option>
                        <option value="RN">RN - Rio Grande do Norte</option>
                        <option value="RO">RO - Rondônia</option>
                        <option value="RR">RR - Roraima</option>
                        <option value="RS">RS - Rio Grande do Sul</option>
                        <option value="SC">SC - Santa Catarina</option>
                        <option value="SP">SP - São Paulo</option>
                        <option value="SE">SE - Sergipe</option>
                        <option value="TO">TO - Tocantins</option>
                    </select>
                </label>
            </section>
            <section class="row">
                <label class="col s7">Cidade Destino
                    <input type="text" name="DEST_VIAGEM" id="DEST_VIAGEM">
                </label>
                <label class="col s5">UF Destino
                    <select class="browser-default" name="EST_DEST_VIAGEM" id="EST_DEST_VIAGEM">
                        <option value="" disabled selected>Selecione</option>
                        <option value="AC">AC - Acre</option>
                        <option value="AL">AL - Alagoas</option>
                        <option value="AM">AM - Amazonas</option>
                        <option value="AP">AP - Amapá</option>
                        <option value="BA">BA - Bahia</option>
                        <option value="CE">CE - Ceará</option>
                        <option value="DF">DF - Distrito Federal</option>
                        <option value="ES">ES - Espírito Santo</option>
                        <option value="GO">GO - Goiás</option>
                        <option value="MA">MA - Maranhão</option>
                        <option value="MG">MG - Minas Gerais</option>
                        <option value="MS">MS - Mato Grosso do Sul</option>
                        <option value="MT">MT - Mato Grosso</option>
                        <option value="PA">PA - Pará</option>
                        <option value="PB">PB - Paraíba</option>
                        <option value="PE">PE - Pernambuco</option>
                        <option value="PI">PI - Piauí</option>
                        <option value="PR">PR - Paraná</option>
                        <option value="RJ">RJ - Rio de Janeiro</option>
                        <option value="RN">RN - Rio Grande do Norte</option>
                        <option value="RO">RO - Rondônia</option>
                        <option value="RR">RR - Roraima</option>
                        <option value="RS">RS - Rio Grande do Sul</option>
                        <option value="SC">SC - Santa Catarina</option>
                        <option value="SP">SP - São Paulo</option>
                        <option value="SE">SE - Sergipe</option>
                        <option value="TO">TO - Tocantins</option>
                    </select>
                </label>
            </section>
            <section class="row">
                <label class="col s3">Distância Viagem (KM)
                    <input type="number" name="KM_VIAGEM" id="KM_VIAGEM">
                </label>
                <label class="col s3">Tipo da Viagem
                    <input type="number" name="TIPO_VIAGEM" id="TIPO_VIAGEM">
                </label>
                <label class="col s3">Motivo Viagem
                    <input type="number" name="MOTIVO_VIAGEM" id="MOTIVO_VIAGEM">
                </label>
            </section>
            <section class="row">
                <label class="col s4">Valor
                    <input type="number" name="VALOR_VIAGEM" id="VALOR_VIAGEM">
                </label>
                <label class="col s8">Observações
                    <textarea name="OBS_VIAGEM" id="OBS_VIAGEM"></textarea>
                </label>
            </section>
            <button type="button" class="btn limpaCampos blue darken-4">Limpar</button>
            <button type="submit" class="btn salvarDados limpaCampos blue darken-4 right">Salvar</button>
            <button type="button" class=" btn cancelarInput blue darken-4 right" onclick="popOpen('#cadViagem')">Cancelar</button>
        </form>
    </div>
</body>

<script src="js/jquery-3.4.1.js" type="text/javascript"></script>
<script src="js/global.js" type="text/javascript"></script>
</html>