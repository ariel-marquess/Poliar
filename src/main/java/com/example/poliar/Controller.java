package com.example.poliar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class Controller {

    // Declarando os componentes que referenciarão as páginas da aplicação
    @FXML
    private VBox pg_inicial;

    @FXML
    private VBox pg_login;

    @FXML
    private VBox pg_home;

    @FXML
    private VBox pg_descProjeto;

    @FXML
    private VBox pg_catNoticias;

    @FXML
    private VBox pg_perfil;

    @FXML
    private VBox pg_sobre;

    @FXML
    private VBox pg_subVoluntario;

    @FXML
    private VBox pg_descNoticia;

    @FXML
    private VBox pg_subProjeto;

    @FXML
    private VBox pg_catProjetos;



    // Declarando as caixas de texto presentes na view
    @FXML
    private TextField cx_email;

    @FXML
    private TextField cx_senha;

    @FXML
    private TextArea cx_levaVoluntariar;

    @FXML
    private TextField cx_participarAcoes;

    @FXML
    private TextArea cx_objetivoProjeto;



    // Declarando as labels presentes na view
    @FXML
    private Label lb_descProjeto;

    @FXML
    private Label lb_descAcaoProjeto;

    @FXML
    private Label lb_nomeProjeto;

    @FXML
    private Label lb_titulo;

    @FXML
    private Label lb_sobreTitulo;

    @FXML
    private Label lb_textoCorrido;



    // Declarando as HBox que servem de imagens na view
    @FXML
    private VBox img_descProjeto;

    @FXML
    private HBox img_descAcaoProjeto;

    @FXML
    private HBox img_noticia;



    // Declarando as caixas de celeção presentes na view
    @FXML
    private CheckBox cb_voluntariarSim;

    @FXML
    private CheckBox cb_voluntariarNao;

    @FXML
    private CheckBox cb_coordenadorSim;

    @FXML
    private CheckBox cb_coordenadorNao;



    // Declarando as listas suspensas presentes na view
    @FXML
    private ChoiceBox<String> ls_areaAtuacao;



    // Declaração de caixas de organização
    @FXML
    private VBox container;



    // Funções gerais
    public static BackgroundImage returnImagem(int num) {
        Image imagem = switch (num) {
            case 1 ->  //Projeto Rio Grande
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUTGOivwXt9ySaRc7IpY_cPwOMG2tRrTqzfw&s", true);
            case 2 ->  //Projeto Serra Verde
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDdJ_IELEh1fksuiUKGF6gSty_S0hGPRVkA&s", true);
            case 3 ->  //Projeto Abelha Rainha
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGeXUrFVczukQ-kZtwZ5fvAhV4LaJQOKnhYA&s", true);
            case 4 ->  //Projeto Mundo e Educação
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQndPs7aUVQBACVUBatOqqMMxHtXZEQNTSJYg&s", true);
            case 5 ->  //Notícia vinculada ao projeto Rio Grande
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrnP14BCOcxgS9UqMX3eUj80WHmk8CIaotNQ&s", true);
            case 6 ->  //Notícia vinculada ao projeto Serra Verde
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqClv2k9gHIP75nE64ClpP2C6ryckxpmd4IA&s", true);
            case 7 ->  //Notícia vinculada ao projeto Abelha Rainha
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfwSSeXRJacNTnnrePGNaalOpMjPoFK34vdA&s", true);
            case 8 ->  //Notícia vinculada ao projeto Mundo e Educação
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLLdBD2cqI_dEhJmI9r4casCTlRUMXLn3c6A&s", true);
            default ->
                    new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQO5kCepNdhZvDKJtmPAIWnloSdTal7N1CQaA&s", true);
        };

        return new BackgroundImage(
                imagem,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(
                        BackgroundSize.AUTO,
                        BackgroundSize.AUTO,
                        false,
                        false,
                        true,
                        false
                )
        );
    }



    // Interações comuns à maioria das páginas
    @FXML
    protected void onHome() {
        pg_catProjetos.setVisible(false);
        pg_descProjeto.setVisible(false);
        pg_catNoticias.setVisible(false);
        pg_descNoticia.setVisible(false);
        pg_perfil.setVisible(false);
        pg_sobre.setVisible(false);
        pg_subProjeto.setVisible(false);
        pg_subVoluntario.setVisible(false);
        pg_home.setVisible(true);
    }

    @FXML
    protected void onExplorar() {
        pg_descProjeto.setVisible(false);
        pg_catNoticias.setVisible(false);
        pg_descNoticia.setVisible(false);
        pg_perfil.setVisible(false);
        pg_sobre.setVisible(false);
        pg_subProjeto.setVisible(false);
        pg_subVoluntario.setVisible(false);
        pg_home.setVisible(false);
        pg_catProjetos.setVisible(true);
    }

    @FXML
    protected void onNoticias() {
        pg_descProjeto.setVisible(false);
        pg_descNoticia.setVisible(false);
        pg_perfil.setVisible(false);
        pg_sobre.setVisible(false);
        pg_subProjeto.setVisible(false);
        pg_subVoluntario.setVisible(false);
        pg_home.setVisible(false);
        pg_catProjetos.setVisible(false);
        pg_catNoticias.setVisible(true);
    }

    @FXML
    protected void onPerfil() {
        pg_descProjeto.setVisible(false);
        pg_descNoticia.setVisible(false);
        pg_sobre.setVisible(false);
        pg_subProjeto.setVisible(false);
        pg_subVoluntario.setVisible(false);
        pg_home.setVisible(false);
        pg_catProjetos.setVisible(false);
        pg_catNoticias.setVisible(false);
        pg_perfil.setVisible(true);
    }

    @FXML
    protected void onSobre() {
        pg_descProjeto.setVisible(false);
        pg_descNoticia.setVisible(false);
        pg_subProjeto.setVisible(false);
        pg_subVoluntario.setVisible(false);
        pg_home.setVisible(false);
        pg_catProjetos.setVisible(false);
        pg_catNoticias.setVisible(false);
        pg_perfil.setVisible(false);
        pg_sobre.setVisible(true);
    }



    // Interações na página inicial
    @FXML
    protected void onEntrarInicial() {
        pg_inicial.setVisible(false);
        pg_login.setVisible(true);
    }



    // Interações na página de login
    @FXML
    protected void onEntrarLogin() {
        if (cx_email.getText().equals("admin") && cx_senha.getText().equals("senha")){
            pg_login.setVisible(false);
            pg_home.setVisible(true);
        }
    }



    // Interações realizadas na página home
    @FXML
    protected void onSubmeterProjeto() {
        pg_home.setVisible(false);

        ObservableList<String> itens = FXCollections.observableArrayList(
                "Reciclagem",
                "Agroecologia",
                "Conservação da fauna e flora",
                "Energia limpa",
                "Questões do clima",
                "Mobilidade sustentável",
                "Educação ambiental",
                "Direitos socioambientais");
        ls_areaAtuacao.setItems(itens);
        pg_subProjeto.setVisible(true);
    }



    // Interações na página de explorar projetos
    @FXML
    protected void onRioGrande(){
        pg_catProjetos.setVisible(false);

        lb_descAcaoProjeto.setText("Limpando nossas\nbelezas");
        lb_descProjeto.setText("""
                Projeto que atua na limpeza de praias, rios e áreas naturais, envolvendo
                moradores e voluntários em mutirões ecológicos. Também promove práticas
                agroecológicas e reflorestamento em regiões ribeirinhas. Estimula a
                conscientização sobre o uso sustentável da água e do solo.""");
        lb_nomeProjeto.setText("""
                Projeto
                Rio Grande""");
        img_descProjeto.setBackground(new Background(returnImagem(1)));
        img_descAcaoProjeto.setBackground(new Background(returnImagem(5)));

        pg_descProjeto.setVisible(true);
    }

    @FXML
    protected void onSerraVerde(){
        pg_catProjetos.setVisible(false);

        lb_descAcaoProjeto.setText("Reviver o\nabandonado");
        lb_descProjeto.setText("""
                Voltado à recuperação ambiental, o Projeto Serra Verde transforma terrenos
                baldios e áreas degradadas em espaços verdes e produtivos. Promove o
                plantio de espécies nativas, ações educativas e o engajamento da comunidade
                local. Busca restaurar o equilíbrio ecológico em zonas metropolitanas
                e rurais.""");
        lb_nomeProjeto.setText("""
                Projeto
                Serra Verde""");
        img_descProjeto.setBackground(new Background(returnImagem(2)));
        img_descAcaoProjeto.setBackground(new Background(returnImagem(6)));

        pg_descProjeto.setVisible(true);
    }

    @FXML
    protected void onAbelhaRainha(){
        pg_catProjetos.setVisible(false);

        lb_descAcaoProjeto.setText("Sem abelhas,\nsem futuro");
        lb_descProjeto.setText("""
                Com foco na convivência harmoniosa entre humanos e abelhas, o projeto realiza
                a retirada segura de colmeias em áreas urbanas. Também desenvolve campanhas
                educativas sobre o papel vital das abelhas na polinização e na manutenção da
                biodiversidade. Atua em escolas e espaços públicos.""");
        lb_nomeProjeto.setText("""
                Projeto
                Abelha Rainha""");
        img_descProjeto.setBackground(new Background(returnImagem(3)));
        img_descAcaoProjeto.setBackground(new Background(returnImagem(7)));

        pg_descProjeto.setVisible(true);
    }

    @FXML
    protected void onMundoEducacao(){
        pg_catProjetos.setVisible(false);

        lb_descAcaoProjeto.setText("Educação para\no futuro");
        lb_descProjeto.setText("""
                Iniciativa que une educação ambiental, inovação e tecnologia para estimular
                o protagonismo jovem. Atua em escolas e espaços públicos com oficinas,
                campanhas e projetos voltados ao desenvolvimento sustentável. Acredita na
                transformação social por meio do conhecimento""");
        lb_nomeProjeto.setText("""
                Mundo &
                Educação""");
        img_descProjeto.setBackground(new Background(returnImagem(4)));
        img_descAcaoProjeto.setBackground(new Background(returnImagem(8)));

        pg_descProjeto.setVisible(true);
    }



    // Interações na página do catálogo de notícias
    @FXML
    protected void onNoticiaRioGrande(){
        pg_catNoticias.setVisible(false);

        lb_titulo.setText("""
                Projeto Rio Grande
                faz limpeza de praia
                de cidade""");
        lb_sobreTitulo.setText("""
                Anos de sugeira foram
                extinguidos""");
        lb_textoCorrido.setText("""
                No último final de semana, o Projeto Rio Grande mobilizou voluntários,
                pescadores e estudantes para uma grande ação de limpeza na Praia do
                Sol, um dos cartões-postais da região. Mais de 2 toneladas de resíduos
                foram recolhidas, entre plásticos, pneus e entulho.
                
                Além da limpeza, foram instaladas placas educativas com orientações
                sobre descarte correto e preservação da fauna marinha. A ação contou
                com apoio da Secretaria Municipal de Meio Ambiente e de ONGs locais.""");
        img_noticia.setBackground(new Background(returnImagem(5)));

        pg_descNoticia.setVisible(true);
    }

    @FXML
    protected void onNoticiaAbelhaRainha(){
        pg_catNoticias.setVisible(false);

        lb_titulo.setText("""
                Projeto Abelha Rainha
                realiza campanha em
                escolas sobre a
                importância das abelhas""");
        lb_sobreTitulo.setText("""
                Ação educativa leva ciência
                e cuidado ambiental a estudantes""");
        lb_textoCorrido.setText("""
                Sensibilizar as novas gerações sobre o papel das abelhas no planeta é o
                objetivo da campanha lançada pelo Projeto Abelha Rainha em escolas
                públicas da cidade. A atividade inclui oficinas, jogos, teatro de
                fantoches e observação guiada de colmeias.
                
                As ações mostram como as abelhas contribuem para a produção de alimentos,
                a manutenção da biodiversidade e o equilíbrio dos ciclos naturais. O
                projeto também alerta para os riscos que essas espécies enfrentam com o
                uso excessivo de agrotóxicos e a perda de habitat.
                
                Uma professora participante destacou: “As crianças aprendem brincando,
                e isso transforma a relação delas com a natureza.”""");
        img_noticia.setBackground(new Background(returnImagem(7)));

        pg_descNoticia.setVisible(true);
    }

    @FXML
    protected void onNoticiaSerraVerde(){
        pg_catNoticias.setVisible(false);

        lb_titulo.setText("""
                Projeto Serra Verde
                revitaliza terreno
                baldio na região
                metropolitana da cidade""");
        lb_sobreTitulo.setText("""
                Projeto Rio Grande revitaliza
                terreno baldio na região
                metropolitana da cidade""");
        lb_textoCorrido.setText("""
                Um espaço antes abandonado, tomado por entulho e lixo doméstico, está sendo
                transformado em uma nova área verde urbana graças à iniciativa do Projeto
                Rio Grande. Localizado nos arredores da cidade, o terreno de cerca de 1 mil
                metros quadrados foi mapeado por voluntários do projeto no início do ano.
                
                Desde então, a equipe vem realizando mutirões comunitários com apoio de
                moradores locais e estudantes para limpar o espaço e dar início ao processo
                de reflorestamento com espécies nativas. Além do plantio, o projeto prevê
                a criação de uma horta comunitária, trilhas educativas e espaços de
                convivência.
                
                “A ideia é que este espaço se torne um ponto de encontro, de educação ambiental
                e de bem-estar para a comunidade”, afirma Carlos Alberto, coordenador do
                Rio Grande.""");
        img_noticia.setBackground(new Background(returnImagem(6)));

        pg_descNoticia.setVisible(true);
    }

    @FXML
    protected void onNoticiaMundoEducacao(){
        pg_catNoticias.setVisible(false);

        lb_titulo.setText("""
                Educação e tecnologia
                para um desenvolvimento
                sustentável""");
        lb_sobreTitulo.setText("""
                Oficinas mostram como a
                tecnologia pode mudar o planeta""");
        lb_textoCorrido.setText("""
                O avanço da tecnologia tem potencial para transformar a educação e contribuir
                diretamente para práticas mais sustentáveis. Com essa premissa, o Projeto Mundo e
                Tecnologia lançou uma série de oficinas gratuitas voltadas a estudantes do ensino
                fundamental, com foco em robótica ecológica, uso consciente da internet e
                desenvolvimento de aplicativos com impacto social.
                
                As atividades ocorrem em laboratórios móveis que percorrem escolas públicas e espaços
                comunitários. Em cada oficina, os alunos aprendem como a inovação pode ser usada
                para resolver problemas reais, como desperdício de energia, descarte de lixo e
                mobilidade urbana.
                
                O projeto visa despertar a curiosidade científica desde cedo, promovendo uma geração
                mais crítica e engajada com os desafios ambientais.""");
        img_noticia.setBackground(new Background(returnImagem(8)));

        pg_descNoticia.setVisible(true);
    }



    // Interações realizadas na página da descrição dos projetos
    @FXML
    protected void onReturnProjeto(){
        pg_descProjeto.setVisible(false);
        pg_catProjetos.setVisible(true);
    }

    @FXML
    protected void onSejaMembro(){
        pg_descProjeto.setVisible(false);
        pg_subVoluntario.setVisible(true);
    }



    // Interações realizadas na página de submissão de voluntariado
    @FXML
    protected void onReturnSubmissao(){
        pg_subVoluntario.setVisible(false);
        pg_descNoticia.setVisible(true);
    }

    @FXML
    protected void onVoluntariar(){
        if (!cx_levaVoluntariar.getText().isEmpty() && !cx_participarAcoes.getText().isEmpty() && (cb_voluntariarNao.isSelected() || cb_voluntariarSim.isSelected())){
            pg_subVoluntario.setVisible(false);
            pg_catProjetos.setVisible(true);

            cx_levaVoluntariar.setText("");
            cx_participarAcoes.setText("");
            cb_voluntariarSim.setSelected(false);
            cb_voluntariarNao.setSelected(false);
        }
    }

    @FXML
    protected void onVoluntariarSim(){
        if (cb_voluntariarSim.isSelected()){
            cb_voluntariarNao.setSelected(false);
        }
    }

    @FXML
    protected void onVoluntariarNao(){
        if (cb_voluntariarNao.isSelected()){
            cb_voluntariarSim.setSelected(false);
        }
    }



    // Intereções no formulário de submissão de projeto
    @FXML
    protected void onReturnHome(){
        pg_subProjeto.setVisible(false);
        pg_home.setVisible(true);
    }

    @FXML
    protected void onSubmeter(){
        if (!ls_areaAtuacao.getValue().isEmpty() && !cx_objetivoProjeto.getText().isEmpty() && (cb_coordenadorSim.isSelected() || cb_coordenadorNao.isSelected())){
            pg_subProjeto.setVisible(false);
            pg_home.setVisible(true);

            ls_areaAtuacao.setValue("");
            cx_objetivoProjeto.setText("");
            cb_coordenadorSim.setSelected(false);
            cb_coordenadorNao.setSelected(false);
            container.setDisable(true);
        }
    }

    @FXML
    protected void onCoordenadorSim(){
        if(cb_coordenadorSim.isSelected()){
            cb_coordenadorNao.setSelected(false);
        }
    }

    @FXML
    protected void onCoordenadorNao(){
        if(cb_coordenadorNao.isSelected()){
            cb_coordenadorSim.setSelected(false);
        }
    }
}
