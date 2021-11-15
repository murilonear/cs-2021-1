Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
R: git --version
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
  R: Comando que mostra as informações de ajuda do git.
  b. git help checkout
  R: Mostra a página de manual do comando checkout.
  c. git help merge
  R: Mostra a página de manual do comando merge.
  d. git init
  R: Criar um novo repositório.
  e. git add --all
  R: Comando para adicionar todos arquivos que foram modificados.
  f. git add -u
  R: Comando para adicionar os arquivos que foram editados e são monitorados no git.
  g. git config -l
  R: Apresenta a lista de todas as configurações do usuário corrente.
  h. git mv a.txt b.txt
  R: Este comando vai renomear o arquivo a.txt para b.txt.
  i. git reset --hard
  R: Comando da reset no commit, passando a mostrar o último commit.
  j. git log -27
  R: Apresenta lista dos últimos 27 commits em log.

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
R:
git add --all
git commit -m "Novo commit"


4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
R:
git diff

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
R:
git ls-files . --exclude-standard --others

6. Qual o comando para efetuar um _commit_?
R:
git commit -m "Novo Commit"

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
R:
git reset teste.txt

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
R:
Criar ou editar o .gitignore, colocando o nome do diretório dentro do arquivo.

9. O que acontece se o seu repositório local for acidentalmente removido?
R:
Todos os arquivos do repositório local serão apagados, mas não terá impacto com o repositório remoto, somente se for feito uma nova atualização via commit com os arquivos apagados.

10. Como clonar um repositório remoto?
R:
utilizando o comando git clone, passando por exemplo: git clone [URL]

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
R:
git log --pretty=oneline 

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
R: 
No arquivo "~ /.gitconfig"

13. Qual o comando para criar um repositório local?
R:
Criando o local que deseja criar o repoítório, abrindo o git nela e executando git init.

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
R:
O nome do repositório será  mesmo de onde foi executado e o endereço onde foi criado.

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
R:
Git add --all 

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
R:
Se trata de um algorítmo de hash, que cria checksums, para cada arquivo ao executar a hash, passa a gerar um valor SHA1 e basta realizar qualquer alteração, que ao executar a hash, retornará em um valor de SHA1 totalmente diferente, garantindo assim que seja possível detectar qualquer alteração no git.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
R:
-abbrev-commit 

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
R:
Não, o comando git add -u adiciona os arquivos editados e que são monitorados pelo git. 

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
R:
O primeiro retorna ao último commit e mantém os últimos arquivos no Stage e o segundo exite o último commit, dando reset no commit corrente.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
R:
git clean -f 

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
R:
No arquivo .gitignore  

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
R: 
Acrescentando no .gitignore o * .class

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
R:
Feito, git clone https://github.com/jquery/jquery.git.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
R:
Mostra o nome e email dos participantes

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
R:
Apresenta a URL do diretório remoto.

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
R:
Utilizar o comando git tag para fazer a listagem de tags.

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
R:
git tag -a

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
R:
Cria uma tag com a mensagem "minha versão ouro"

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
R:
Apresenta os dados da tag junto com o commit.

30. O que o comando **git push origin 3.4-gold** teria como efeito?
R:
Mostra a informação de quem criou a tag, data de quando o commit recebeu a tag e a mensagem antes de mostrar informação do commit.

31. Após executar um commit, qual o efeito de **git commit --amend**?
R:
Editar a mensagem do commit anterior sem alterar o seu instantâneo.

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
R:
O git reset HEAD x.txt retira o arquivo x.txt da staging area.

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
R:
Descarta as mudanças feitas no arquivo. 

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
R:
O git reset HEAD x.txt retira o arquivo x.txt da staging area, já o git checkout -- a.txt descarta as mudanças feitas no arquivo.

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
R:
Realizado teste com repositório aprender.

