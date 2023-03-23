package org.example;

public class Oriental extends Hincha{
    private Double valorDescuento = 0.25;
    private Double costoBoleta = 80000d;

    public Double valorNeto;
    public Double valorDescuentoTribuna;
    public Double valorDescuentoFecha;
    private Double valorTotal;

    //Metodos
    @Override
    public Double valorNeto(Integer cantidad) {
        if (cantidad > 2) {
            System.out.println("Error");
        } else {
            this.valorNeto = this.costoBoleta * cantidad;
        }
        return valorNeto;
    }

    @Override
    public Double descuentoTribuna() {
        this.valorDescuentoTribuna = this.valorNeto - (this.valorNeto * this.valorDescuentoTribuna);
        return valorDescuentoTribuna;
    }

    public Double descuentoFecha(){
        this.valorDescuentoFecha = this.valorNeto - (this.valorNeto * this.descuentoFecha(1));
        return valorDescuentoFecha;
    }

    public Double valorIva() {
        this.valorDescuento = this.valorNeto + (this.valorNeto * this.getIva());
        return valorIva();
    }

    public Double calcularValorTotal(){
        valorTotal = valorNeto - valorDescuentoFecha -valorDescuentoTribuna + valorIva();
        return valorTotal;
    }
}
