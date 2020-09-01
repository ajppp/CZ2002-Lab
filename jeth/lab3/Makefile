JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
					PlaneApp.java \
					PlaneSeat.java \
					Plane.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

run:
	java PlaneApp
