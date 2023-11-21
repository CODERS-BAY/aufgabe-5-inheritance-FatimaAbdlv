package figures;

public abstract class Figure implements IFigure {
    private final String name;

    public Figure(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }


    }
