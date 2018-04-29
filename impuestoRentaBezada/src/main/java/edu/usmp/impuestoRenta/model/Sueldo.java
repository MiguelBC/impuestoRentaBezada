package edu.usmp.impuestoRenta.model;


import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

    public class Sueldo {


        private Integer dni;
        private String nombre;
        @NotNull
        @Min(3)
        private double sueldo;
        @NotNull
        @Min(3)
        private double uit;
        private double impuesto_total;
        private double bruto_total;
        private double neta_total;
        private int retencion_mensual;

        private double max_5;
        private double afecto_5;
        private double imp_5;
        private double max_20;
        private double afecto_20;
        private double imp_20;
        private double max_35;
        private double afecto_35;
        private double imp_35;
        private double max_45;
        private double afecto_45;
        private double imp_45;
        private String max_46;
        private double afecto_46;
        private double imp_46;
        private double total_afecto;
        private double uit_descontable;
        private double renta_grabable;
        private String tipo;
		public Integer getDni() {
			return dni;
		}
		public void setDni(Integer dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getSueldo() {
			return sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		public double getUit() {
			return uit;
		}
		public void setUit(double uit) {
			this.uit = uit;
		}
		public double getImpuesto_total() {
			return impuesto_total;
		}
		public void setImpuesto_total(double impuesto_total) {
			this.impuesto_total = impuesto_total;
		}
		public double getBruto_total() {
			return bruto_total;
		}
		public void setBruto_total(double bruto_total) {
			this.bruto_total = bruto_total;
		}
		public double getNeta_total() {
			return neta_total;
		}
		public void setNeta_total(double neta_total) {
			this.neta_total = neta_total;
		}
		public int getRetencion_mensual() {
			return retencion_mensual;
		}
		public void setRetencion_mensual(int retencion_mensual) {
			this.retencion_mensual = retencion_mensual;
		}
		public double getMax_5() {
			return max_5;
		}
		public void setMax_5(double max_5) {
			this.max_5 = max_5;
		}
		public double getAfecto_5() {
			return afecto_5;
		}
		public void setAfecto_5(double afecto_5) {
			this.afecto_5 = afecto_5;
		}
		public double getImp_5() {
			return imp_5;
		}
		public void setImp_5(double imp_5) {
			this.imp_5 = imp_5;
		}
		public double getMax_20() {
			return max_20;
		}
		public void setMax_20(double max_20) {
			this.max_20 = max_20;
		}
		public double getAfecto_20() {
			return afecto_20;
		}
		public void setAfecto_20(double afecto_20) {
			this.afecto_20 = afecto_20;
		}
		public double getImp_20() {
			return imp_20;
		}
		public void setImp_20(double imp_20) {
			this.imp_20 = imp_20;
		}
		public double getMax_35() {
			return max_35;
		}
		public void setMax_35(double max_35) {
			this.max_35 = max_35;
		}
		public double getAfecto_35() {
			return afecto_35;
		}
		public void setAfecto_35(double afecto_35) {
			this.afecto_35 = afecto_35;
		}
		public double getImp_35() {
			return imp_35;
		}
		public void setImp_35(double imp_35) {
			this.imp_35 = imp_35;
		}
		public double getMax_45() {
			return max_45;
		}
		public void setMax_45(double max_45) {
			this.max_45 = max_45;
		}
		public double getAfecto_45() {
			return afecto_45;
		}
		public void setAfecto_45(double afecto_45) {
			this.afecto_45 = afecto_45;
		}
		public double getImp_45() {
			return imp_45;
		}
		public void setImp_45(double imp_45) {
			this.imp_45 = imp_45;
		}
		public String getMax_46() {
			return max_46;
		}
		public void setMax_46(String max_46) {
			this.max_46 = max_46;
		}
		public double getAfecto_46() {
			return afecto_46;
		}
		public void setAfecto_46(double afecto_46) {
			this.afecto_46 = afecto_46;
		}
		public double getImp_46() {
			return imp_46;
		}
		public void setImp_46(double imp_46) {
			this.imp_46 = imp_46;
		}
		public double getTotal_afecto() {
			return total_afecto;
		}
		public void setTotal_afecto(double total_afecto) {
			this.total_afecto = total_afecto;
		}
		public double getUit_descontable() {
			return uit_descontable;
		}
		public void setUit_descontable(double uit_descontable) {
			this.uit_descontable = uit_descontable;
		}
		public double getRenta_grabable() {
			return renta_grabable;
		}
		public void setRenta_grabable(double renta_grabable) {
			this.renta_grabable = renta_grabable;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
        
        
   
    }
