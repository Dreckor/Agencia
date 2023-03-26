package com.example.agencia;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class PrincipalRes {
    public static Tiquete reserva1 = new Tiquete();

    public static PrincipalCliente principalCliente = new PrincipalCliente();
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;
        boolean datosReservaCapturados = false;
        // Ciclo principal del programa
        while (!salir) {
            // Menú principal
            opcion = Integer.parseInt(showInputDialog(null, "Menú de Tiquetes\n"
                    + "1. Capturar Datos Cliente\n"
                    + "2. Capturar Datos Reserva\n"
                    + "3. Liquidar Reserva\n"
                    + "4. Mosrtar datos Reserva\n"
                    + "5. Salir\n"
                    + "Digite su opción:", "Menú", JOptionPane.PLAIN_MESSAGE));

            // Selección de opción
            switch (opcion) {
                case 1:
                    principalCliente.main();
                    break;
                case 2:
                    capturarDatosReserva();
                    datosReservaCapturados = true;
                    break;
                case 3:
                    if(!datosReservaCapturados){
                        JOptionPane.showMessageDialog(null, "Error: los datos de la reserva no han sido capturados.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        String reserva = liquidarReserva();
                        JOptionPane.showMessageDialog(null,reserva , "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    if(!datosReservaCapturados){
                        JOptionPane.showMessageDialog(null, "Error: los datos de la reserva no han sido capturados.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        consultarDatosReserva();
                    }
                    break;
                case 5:
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...", "Adiós", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private static void consultarDatosReserva() {
        JOptionPane.showMessageDialog(null, reserva1.toString(), "Consultar Datos Reserva", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String liquidarReserva() {
        reserva1.setFormaPago(JOptionPane.showInputDialog(null, "Ingrese la forma de pago efectivo/crédito:"));
        int personas = (Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de personas:")));
        String reserva = reserva1.LiquidaReserva(reserva1.getCiudad(),personas,reserva1.getFormaPago());
        return reserva;
    }

    public static void capturarDatosReserva() {

        // Capturar los datos utilizando JOptionPane.showInputDialog()
       reserva1.setNroTiquete(JOptionPane.showInputDialog(null, "Ingrese el número de tiquete:"));
       reserva1.setCiudad(JOptionPane.showInputDialog(null, "Ingrese la ciudad de destino (A, B, C o D):"));
       reserva1.setDiasHospedaje(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de días de hospedaje:")));
    }
}
