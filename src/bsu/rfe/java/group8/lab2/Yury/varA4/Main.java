package bsu.rfe.java.group8.lab2.Yury.varA4;


import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.Box;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Main {

    private static final long serialVersionUID = 1L;
    // Константы с исходным размером окна приложения
    private static final int WIDTH = 700;
    private static final int HEIGHT = 500;

    // Массив коэффициентов многочлена
    private Double[] coefficients;

    // Объект диалогового окна для выбора файлов
    // Кампонент не создается изначально, т. к. может и не понадоюится
    // пользователю если тот не собирается сохранять данные в файл
    private JFileChooser fileChooser = null;

    // Элементы меню
    private JMenuItem saveToTextMenuItem;
    private JMenuItem saveToGraphicsMenuItem;
    private JMenuItem commaSeparatedValues;
    private JMenuItem searchValueMenuItem;
    private JMenuItem searchRangeMenuAction;

    private JMenuItem informationItem;

    // Поля ввода для считывания значений переменных
    private JTextField textFieldFrom;
    private JTextField textFieldTo;
    private JTextField textFieldStep;

    private Box hBoxResult;

    private DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance();

    // Визуализатор ячеек таблицы
    private GornerTableCellRenderer renderer = new GornerTableCellRenderer();

   

    public Main(Double[] coefficients) {
        super("Табулирование многочлена на отрезке по схеме Горнера");

        // Запомнить во внутреннем поле переданные коэффициенты
        this.coefficients = coefficients;
        setSize(WIDTH, HEIGHT);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width - WIDTH) / 2, (kit.getScreenSize().height - HEIGHT) / 2);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Файл");
        // Добавить его в главное меню
        menuBar.add(fileMenu);
        JMenu tableMenu = new JMenu("Таблица");
        menuBar.add(tableMenu);
        JMenu infMenu = new JMenu("Справка");
        menuBar.add(infMenu);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
