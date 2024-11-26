CC = javac

RENV = java

SRC_JAVA_DIR = ./src/java

SRC_TEST_DIR = ./src/test

TARGET = ./target

TARGET_JAVA_DIR = ./target/java

TARGET_TEST_DIR = ./target/test

#ilk once test
#compile:
#	$(CC) $(SRC_TEST_DIR)/*.java -d $(TARGET)    

#compile with target adsadasdasdasdsa
$(TARGET)/src/java/school/* $(TARGET)/src/java/Main.class: $(SRC_JAVA_DIR)/school/*.java $(SRC_JAVA_DIR)/Main.java
	$(CC) $(SRC_JAVA_DIR)/school/*.java $(SRC_JAVA_DIR)/Main.java -d $(TARGET) 



test:
	$(CC) $(SRC_TEST_DIR)/*.java -d $(TARGET) -Xlint:unchecked
	
