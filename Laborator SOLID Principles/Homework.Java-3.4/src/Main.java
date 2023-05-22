public class Main {
    public static void main(String[] args) {
        NormalPrinter printer = new NormalPrinter();
        printer.print();
        PrinterScanner printerScanner = new PrinterScanner();
        printerScanner.print();
        printerScanner.scan();
    }
}