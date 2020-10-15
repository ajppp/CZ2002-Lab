JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
					Shape.java \
					Square.java \
					Rectangle.java \
					Circle.java \
					Triangle.java \
					Shape2DApp.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

2d:
	java Shape2DApp

3d:
	java Shape3DApp
