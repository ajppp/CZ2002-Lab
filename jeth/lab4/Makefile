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
					Shape2DApp.java \
					Cone.java\
					Cuboid.java \
					Cylinder.java \
					Pyramid.java \
					Sphere.java \
					Shape3DApp.java \
					Numbers.java \
					SalePerson.java \
					Sorting.java \
					Strings.java \
					WeeklySales.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

2d:
	java Shape2DApp

3d:
	java Shape3DApp

sales:
	java WeeklySales
