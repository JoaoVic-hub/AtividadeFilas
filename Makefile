# Variáveis
JAVAC = javac
JAVA = java
SRC = src
CLASSES = FilaCircular.java Main.java
MAIN = Main

# Compilar todos os arquivos .java
compile:
	$(JAVAC) $(addprefix $(SRC)/, $(CLASSES))

# Executar o programa principal
run: compile
	$(JAVA) -cp $(SRC) $(MAIN)

# Limpar arquivos .class gerados pela compilação
clean:
	rm -f $(SRC)/*.class
