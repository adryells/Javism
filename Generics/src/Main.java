import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Chamar de T é apenas convenção, podemos chamar de qualquer coisa, T é um "parametro" de classe,
note que ele é usado em todos os metodos.
A intenção é deixar que se criem instancias de Repository de qualquer tipo mantendo a segurança da tipagem
"ah mas é possivel adicionar qlqr tipo sem precisar meter esse T" sim mas ai perde a segurança da tipagem
 */
class Repository<T> {
    private List<T> elements;

    public Repository() {
        this.elements = new ArrayList<>();
    }

    public void add(T item) {
        elements.add(item);
    }

    public boolean remove(T item) {
        return elements.remove(item);
    }

    public List<T> list() {
        return elements;
    }

    public Optional<T> getByIndex(int index) {
        if (index >= 0 && index < elements.size()) {
            return Optional.of(elements.get(index));
        }
        return Optional.empty();
    }
}


public class Main {
    public static void main(String[] args) {
        Repository<String> repoNames = new Repository<>();
        repoNames.add("naruto");
        repoNames.add("sasuke");
        System.out.println("Names: " + repoNames.list());

        Repository<Integer> repoNumbers = new Repository<>();
        repoNumbers.add(7);
        repoNumbers.add(69);
        repoNumbers.add(420);
        repoNumbers.add(666);
        System.out.println("Numbers: " + repoNumbers.list());

        repoNames.getByIndex(1).ifPresent(nome -> System.out.println("Name: " + nome));
    }
}