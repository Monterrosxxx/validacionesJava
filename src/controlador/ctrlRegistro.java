package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

import vista.frmRegistro;

public class ctrlRegistro implements MouseListener{
    
    //1- Mandar a llamar las otras capas
    frmRegistro vista;
    
    //2- Constructor
    public ctrlRegistro(frmRegistro Vista){
        
        this.vista = Vista;
        
        Vista.btnRegistrarse.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnRegistrarse){
         //1- Que no haya campos vacios
            if (vista.txtNombre.getText().isBlank()){       
                JOptionPane.showMessageDialog(vista, "Ingrese un nombre correcto");
            }
         //2-Que el correo sea valido   
            if(!vista.txtCorreo.getText().contains("@")|| !vista.txtCorreo.getText().contains(".com")){
                JOptionPane.showMessageDialog(vista, "Ingrese un correo valido");
            }
         //3-Que la contraseña mas de 6 caracteres
            if (vista.txtContrasena.getText().length() < 6){
                JOptionPane.showMessageDialog(vista, "Contraseña invalida: debe contener minimo 6 caracteres");
            }
        //4- Validar que el usuario solo ingrese numeros en la edad
            try {
                int edadNumerica = Integer.parseInt(vista.txtEdad.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Ingrese numeros");
            }
        //5-Valiodar la edad 
    }
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
