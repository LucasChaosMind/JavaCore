import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) {
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso em KG", "Cálculo IMC - Peso", JOptionPane.QUESTION_MESSAGE));
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua altura em metros", "Cálculo IMC - Altura", JOptionPane.QUESTION_MESSAGE));
        String tipoPessoa;

        while (peso <=0 || altura <= 0) {
            JOptionPane.showMessageDialog(null, "Peso ou Altura com valor menor ou igual a zero", "Erro", JOptionPane.ERROR_MESSAGE);
            peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso em KG", "Cálculo IMC - Peso", JOptionPane.QUESTION_MESSAGE));
            altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua altura em metros", "Cálculo IMC - Altura", JOptionPane.QUESTION_MESSAGE));
        }

        float imc = (peso / (altura * altura));

        if (imc < 20) {
            tipoPessoa = "Magro";
        } else if (imc >= 20 && imc <= 24) {
            tipoPessoa = "Normal";
        } else if (imc >= 25 && imc <= 29) {
            tipoPessoa = "Acima do Peso";
        } else if (imc >= 30 && imc <= 34) {
            tipoPessoa = "Obeso";
        } else {
            tipoPessoa = "Muito obeso";
        }

        String message = "Peso = " + peso + "\nAltura = " + altura + "\nIMC = " + String.format("%.2f", imc) + "\nConsiderado " + tipoPessoa;
        JOptionPane.showMessageDialog(null, message, "Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
    }
}