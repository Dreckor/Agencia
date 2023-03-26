package com.example.agencia;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class PrincipalCliente {

    public static Cliente cliente1 = new Cliente();
    public static void main() {
        int opcion;
        boolean salir = false;

        // Ciclo principal del programa
        while (!salir) {
            // Menú principal
            opcion = Integer.parseInt(showInputDialog(null, "Menú de Clientes\n"
                    + "1. Capturar Datos Cliente\n"
                    + "2. Consultar Datos Cliente\n"
                    + "3. Actualizar Datos Cliente\n"
                    + "4. Salir\n"
                    + "Digite su opción:", "Menú", JOptionPane.PLAIN_MESSAGE));

            // Selección de opción
            switch (opcion) {
                case 1:
                    capturarDatosCliente();
                    break;
                case 2:
                    consultarDatosCliente();
                    break;
                case 3:
                    actualizarDatosCliente();
                    break;
                case 4:
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...", "Adiós", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    public static void capturarDatosCliente() {

        // Capturar los datos utilizando JOptionPane.showInputDialog()
        cliente1.setId(JOptionPane.showInputDialog(null, "Ingrese el ID del cliente:", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE));
        cliente1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE));
        cliente1.setApellidos(JOptionPane.showInputDialog(null, "Ingrese los apellidos del cliente:", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE));
        cliente1.setGenero(JOptionPane.showInputDialog(null, "Ingrese el género del cliente (M/F):", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE));
        cliente1.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del cliente:", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE)));
        cliente1.setCiudad(JOptionPane.showInputDialog(null, "Ingrese la ciudad del cliente:", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE));
        cliente1.setDireccion(JOptionPane.showInputDialog(null, "Ingrese la dirección del cliente:", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE));
        cliente1.setTelefono(JOptionPane.showInputDialog(null, "Ingrese el teléfono del cliente:", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE));
        cliente1.setEmpresa(JOptionPane.showInputDialog(null, "Ingrese la empresa del cliente:", "Capturar Datos Cliente", JOptionPane.PLAIN_MESSAGE));

        // Crear un objeto Cliente con los datos capturados
    }

    public static void consultarDatosCliente() {
        // Lógica para consultar datos de un cliente
        JOptionPane.showMessageDialog(null, cliente1.toString(), "Consultar Datos Cliente", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void actualizarDatosCliente() {
        // Lógica para actualizar datos de un cliente
        String campo = showInputDialog(null, "Ingrese el campo que desea actualizar:\n"
                + "1. ID\n"
                + "2. Nombre\n"
                + "3. Apellidos\n"
                + "4. Género\n"
                + "5. Edad\n"
                + "6. Ciudad\n"
                + "7. Dirección\n"
                + "8. Teléfono\n"
                + "9. Empresa", "Actualizar Datos Cliente", JOptionPane.PLAIN_MESSAGE);

        String valor = showInputDialog(null, "Ingrese el nuevo valor:", "Actualizar Datos Cliente", JOptionPane.PLAIN_MESSAGE);

        switch (campo) {
            case "1":
                cliente1.setId(valor);
                break;
            case "2":
                cliente1.setNombre(valor);
                break;
            case "3":
                cliente1.setApellidos(valor);
                break;
            case "4":
                cliente1.setGenero(valor);
                break;
            case "5":
                cliente1.setEdad(Integer.parseInt(valor));
                break;
            case "6":
                cliente1.setCiudad(valor);
                break;
            case "7":
                cliente1.setDireccion(valor);
                break;
            case "8":
                cliente1.setTelefono(valor);
                break;
            case "9":
                cliente1.setEmpresa(valor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }

        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente", "Actualizar Datos Cliente", JOptionPane.INFORMATION_MESSAGE);
    }
}
