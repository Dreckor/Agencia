package com.example.agencia;

public class Tiquete {
    private String NroTiquete;
    private String Ciudad;
    private int DiasHospedaje;
    private int CostoPersona;
    private int CostoComida;
    public double Descuentos;
    public double Total;
    public String FormaPago;

    public Tiquete() { }

    public Tiquete(String nroTiquete, String ciudad, int diasHospedaje) {
        NroTiquete = nroTiquete;
        Ciudad = ciudad;
        DiasHospedaje = diasHospedaje;
    }

    public String LiquidaReserva(String ciudad, int Personas, String formaPago ) {
        Ciudad = ciudad;
        FormaPago = formaPago;
        double valorTiquete = 0;
        double valorDescuento = 0;
        double valorNeto = 0;
        double valorDiaro = 0;
        switch (Ciudad) {
            case "A":
                valorDiaro = 15000;
                CostoPersona = 100000;
                CostoComida = 9000;
                break;
            case "B":
                valorDiaro = 12500;
                CostoPersona = 120000;
                CostoComida = 11000;
                break;
            case "C":
                valorDiaro = 14000;
                CostoPersona = 110000;
                CostoComida = 12000;
                break;
            case "D":
                valorDiaro = 17000;
                CostoPersona = 115000;
                CostoComida = 10000;
                break;

        }
        valorTiquete = ((valorDiaro * Personas) + (CostoComida * Personas) * DiasHospedaje) + (CostoPersona * Personas);

        if (Ciudad == "A" || Ciudad == "B"){
            Descuentos += 2;
        } else if (Ciudad == "C" || Ciudad == "D") {
            Descuentos += 5;
        }

        if(Personas <= 10){
            Descuentos += 10;
        }else {
            Descuentos += 15;
        }
        valorDescuento = (Descuentos * valorTiquete) / 100;
        Total = valorTiquete - valorDescuento;
        if (FormaPago == "efectivo"){
            Descuentos += 4;
            valorDescuento = (Descuentos * valorTiquete) / 100;
            Total = valorTiquete - valorDescuento;
        }else if(FormaPago == "crédito"){
            Total = (1.5 / 100 + 1 ) * Total;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("El valor neto a cancelar es de: $").append(Total).append("\n");
        sb.append("El valor sin descuento es de: $").append(valorTiquete).append("\n");
        sb.append("El porcentaje de descuento es de: ").append(Descuentos).append("%").append("\n");
        sb.append("Este porcentaje equivale a : $").append(valorDescuento).append("\n");
        return sb.toString();

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (NroTiquete != null && !NroTiquete.isEmpty()) {
            sb.append("Número de tiquete: ").append(NroTiquete).append("\n");
        }
        if (Ciudad != null && !Ciudad.isEmpty()) {
            sb.append("Ciudad: ").append(Ciudad).append("\n");
        }
        if (DiasHospedaje > 0) {
            sb.append("Días de hospedaje: ").append(DiasHospedaje).append("\n");
        }
        if (CostoPersona > 0) {
            sb.append("Costo por persona: ").append(CostoPersona).append("\n");
        }
        if (CostoComida > 0) {
            sb.append("Costo por comida: ").append(CostoComida).append("\n");
        }
        sb.append("Descuentos: ").append(Descuentos).append("\n");
        sb.append("Total: ").append(Total).append("\n");
        if (FormaPago != null && !FormaPago.isEmpty()) {
            sb.append("Forma de pago: ").append(FormaPago);
        }
        return sb.toString();
    }
    public String getNroTiquete() {
        return NroTiquete;
    }

    public void setNroTiquete(String nroTiquete) {
        NroTiquete = nroTiquete;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public int getDiasHospedaje() {
        return DiasHospedaje;
    }

    public void setDiasHospedaje(int diasHospedaje) {
        DiasHospedaje = diasHospedaje;
    }

    public int getCostoPersona() {
        return CostoPersona;
    }

    public void setCostoPersona(int costoPersona) {
        CostoPersona = costoPersona;
    }

    public int getCostoComida() {
        return CostoComida;
    }

    public void setCostoComida(int costoComida) {
        CostoComida = costoComida;
    }

    public double getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(double descuentos) {
        Descuentos = descuentos;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String formaPago) {
        FormaPago = formaPago;
    }
}
