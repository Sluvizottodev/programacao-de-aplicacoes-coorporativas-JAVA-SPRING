

import net.sf.jasperreports.engine.*;
import java.util.HashMap;

public class Relatorio {
    public static void main(String[] args) {
        try {
            // Compila o arquivo .jrxml para .jasper
            JasperReport jasperReport = JasperCompileManager.compileReport("src/relatorio.jrxml");

            // Dados vazios (não estamos usando banco de dados aqui)
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), new JREmptyDataSource());

            // Exporta para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "hello.pdf");

            System.out.println("Relatório gerado: hello.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}