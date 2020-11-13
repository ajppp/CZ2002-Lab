CXX = g++
CXXFLAGS = -Wall -g
DEPS = Animal.h childAnimal.h
OBJ = Animal.o childAnimal.o ZooMain.o

%.o: %.c $(DEPS)
	$(CXX) -c -o $@ $< $(CXXFLAGS)

default: $(OBJ)
	$(CXX) $(CXXFLAGS) $(OBJ) -o Zoo

run: 
	./Zoo

clean:
	rm *.o Zoo
