package task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figure;
        figure = new Figure[]{new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10)};

        FigureList list = new FigureList();
            for (Figure fig : figure) {
                list.add(fig);
            }

            list.showAllList();
        }
    }

