package clubesocial;

import javax.swing.JOptionPane;

public class ClubeSocial {

    public static void main(String[] args) {
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n  1 - Criar um sócio \n  2 - Associar um pedido de solicitação a um sócio \n", "Menu", JOptionPane.INFORMATION_MESSAGE));
        
        switch(option) {
            case 1:
                break;
            case 2:
                break;
            default:
                ClubeSocial.main(null);
        }
        
    }
    
}
