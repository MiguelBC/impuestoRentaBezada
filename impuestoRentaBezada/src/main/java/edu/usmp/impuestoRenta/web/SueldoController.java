package edu.usmp.impuestoRenta.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.usmp.impuestoRenta.model.Sueldo;
import edu.usmp.impuestoRenta.repository.SueldoRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
public class SueldoController {
    @Autowired
    private SueldoRepository sueldoRepository;


    @GetMapping("/sueldo/new")
    public String initCreationForm(Model model) {
        model.addAttribute("sueldo", new Sueldo());
        return "sueldoForm";
    }

    @PostMapping("/sueldo/new")
    public String submitForm(@Valid Sueldo sueldo,
                             BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
            return "sueldoForm";
        }

        double uit = 0;
        double salario = 0;
        double total = 0;
        double totalUit = 0;
        double rentaGrabable = 0;
        double val=0;
        double IR = 0;
        int calculo=0;
        int retencionMensual = 0;
        double totalNeta  = 0;
        uit = sueldo.getUit();

        double maximo_5 = 0;
        double monto_afecto_5 = 0;
        double impuesto_5 = 0 ;
        double maximo_20 = 0;
        double monto_afecto_20 = 0;
        double impuesto_20 = 0;
        double maximo_35 = 0;
        double monto_afecto_35 =0 ;
        double impuesto_35 = 0;
        double maximo_45 = 0;
        double monto_afecto_45 = 0;
        double impuesto_45 =0;
        String maximo_46 = "";
        double monto_afecto_46 = 0;
        double impuesto_46 = 0;
        double total_monto_afecto =0;
        salario = sueldo.getSueldo();
        String tipo = sueldo.getTipo();
        if (tipo=="Dependiente"){
            total = (float) salario * 12;
        }else {
            total = (float)( total + (salario *14));
        }

        totalUit = uit*7;


        if (total >= totalUit){
            rentaGrabable = total - totalUit;
            calculo = (int) Math.round(rentaGrabable/uit);

            if (calculo > 45){
                IR = (float) ((uit*5*0.08) + (uit*15*0.14) + (uit*15*0.17)+(uit*10*0.2)+ ((rentaGrabable-(uit*45))*0.3));

                  maximo_5 = uit*5;
                  monto_afecto_5 = uit*5;
                  impuesto_5 = uit*5*0.08 ;
                  maximo_20 = uit*20;
                  monto_afecto_20 = uit*15;
                  impuesto_20 = uit*15*0.14;
                  maximo_35 = uit*35;
                  monto_afecto_35 =uit*15 ;
                  impuesto_35 = uit*15*0.17;
                  maximo_45 = uit * 45;
                  monto_afecto_45 = uit*10;
                  impuesto_45 = uit*10*0.2;
                  maximo_46 = ">" + (uit*45);
                  monto_afecto_46 = rentaGrabable-(uit*45);
                  impuesto_46 =  (rentaGrabable-(uit*45))*0.3;
                  total_monto_afecto = monto_afecto_5 + monto_afecto_20 +monto_afecto_35 +monto_afecto_45 +monto_afecto_46;

            }else{
                if (calculo > 35){
                    IR = (float) ((uit*5*0.08) + (uit*15*0.14) + (uit*15*0.17)+ ((rentaGrabable-(uit*35))*0.2));
                    maximo_5 = uit*5;
                    monto_afecto_5 = uit*5;
                    impuesto_5 = uit*5*0.08 ;
                    maximo_20 = uit*20;
                    monto_afecto_20 = uit*15;
                    impuesto_20 = uit*15*0.14;
                    maximo_35 = uit*35;
                    monto_afecto_35 =uit*15 ;
                    impuesto_35 = uit*15*0.17;
                    maximo_45 = uit * 45;
                    monto_afecto_45 = rentaGrabable-(uit*35);
                    impuesto_45 = (rentaGrabable-(uit*35))*0.2;
                    maximo_46 = ">" + (uit*45);
                    total_monto_afecto = monto_afecto_5 + monto_afecto_20 +monto_afecto_35 +monto_afecto_45;
                }else{
                    if (calculo > 20) {
                        IR = (float) ((uit * 5 * 0.08) + (uit * 15 * 0.14) + ((rentaGrabable - (uit * 20)) * 0.17));
                        maximo_5 = uit*5;
                        monto_afecto_5 = uit*5;
                        impuesto_5 = uit*5*0.08 ;
                        maximo_20 = uit*20;
                        monto_afecto_20 = uit*15;
                        impuesto_20 = uit*15*0.14;
                        maximo_35 = uit*35;
                        monto_afecto_35 =rentaGrabable - (uit * 20) ;
                        impuesto_35 = (rentaGrabable - (uit * 20)) * 0.17;
                        maximo_45 = uit * 45;
                        maximo_46 = ">" + (uit*45);
                        total_monto_afecto = monto_afecto_5 + monto_afecto_20 +monto_afecto_35 ;

                    }else{
                        if (calculo > 5) {
                            IR = (float) ((uit * 5 * 0.08) +  ((rentaGrabable - (uit * 5)) * 0.14));
                            maximo_5 = uit*5;
                            monto_afecto_5 = uit*5;
                            impuesto_5 = uit*5*0.08 ;
                            maximo_20 = uit*20;
                            monto_afecto_20 = rentaGrabable - (uit * 5);
                            impuesto_20 = (rentaGrabable - (uit * 5)) * 0.14;
                            maximo_35 = uit*35;
                            maximo_45 = uit * 45;
                            maximo_46 = ">" + (uit*45);
                            total_monto_afecto = monto_afecto_5 + monto_afecto_20  ;
                        }else{
                            IR = (float) (rentaGrabable * 0.08);
                            maximo_5 = uit*5;
                            monto_afecto_5 = rentaGrabable;
                            impuesto_5 = rentaGrabable * 0.08 ;
                            maximo_20 = uit*20;
                            maximo_35 = uit*35;
                            maximo_45 = uit * 45;
                            maximo_46 = ">" + (uit*45);
                            total_monto_afecto = monto_afecto_5 + monto_afecto_20  ;
                        }
                    }
                }
            }

        }else{

            IR=0;
        }
        totalNeta = total- IR;

        
        retencionMensual =(int) Math.round(IR /12);
        sueldo.setBruto_total(total);
        sueldo.setImpuesto_total(IR);
        sueldo.setNeta_total(totalNeta);
        sueldo.setRetencion_mensual(retencionMensual);
        sueldo.setMax_5(maximo_5);
        sueldo.setAfecto_5(monto_afecto_5);
        sueldo.setImp_5(impuesto_5);
        sueldo.setMax_20(maximo_20);
        sueldo.setAfecto_20(monto_afecto_20);
        sueldo.setImp_20(impuesto_20);
        sueldo.setMax_35(maximo_35);
        sueldo.setAfecto_35(monto_afecto_35);
        sueldo.setImp_35(impuesto_35);
        sueldo.setMax_45(maximo_45);
        sueldo.setAfecto_45(monto_afecto_45);
        sueldo.setImp_45(impuesto_45);
        sueldo.setMax_46(maximo_46);
        sueldo.setAfecto_46(monto_afecto_46);
        sueldo.setImp_46(impuesto_46);
        sueldo.setTotal_afecto(total_monto_afecto);
        sueldo.setUit_descontable(totalUit);
        sueldo.setRenta_grabable(rentaGrabable);
        
        
        sueldoRepository.insert(sueldo);
        return "impuestaRenta";
    }


    @GetMapping("/sueldo/list")
    public String list(Map<String, Object> model) {
        List<Sueldo> sueldo =sueldoRepository.findAll();
        model.put("sueldo", sueldo);
        return "impuestoList";
    }



}
