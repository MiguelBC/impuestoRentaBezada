package edu.usmp.impuestoRenta.repository;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.usmp.impuestoRenta.model.Sueldo;


@Mapper
public interface SueldoRepository  {

    @Select("select * from sueldo")
    List<Sueldo> findAll();

    @Insert("INSERT INTO impuestos.sueldo (dni, nombre, sueldo,uit,total_impuesto, total_bruto,total_neta,retencion_mensual," +
            "maximo_5, monto_afecto_5, impuesto_5,maximo_20,monto_afecto_20, impuesto_20,maximo_35,monto_afecto_35,impuesto_35,maximo_45,monto_afecto_45,impuesto_45,maximo_46,monto_afecto_46,impuesto_46,total_monto_afecto) values" +
            " (#{dni},#{nombre},#{sueldo},#{uit},#{total_impuesto},#{total_bruto}, #{total_neta},#{retencion_mensual}," +
            "#{maximo_5},#{monto_afecto_5},#{impuesto_5},#{maximo_20},#{monto_afecto_20},#{impuesto_20}, #{maximo_35},#{monto_afecto_35},#{impuesto_35},#{maximo_45},#{monto_afecto_45},#{impuesto_45},#{maximo_46},#{monto_afecto_46},#{impuesto_46},#{total_monto_afecto})")
    void insert(Sueldo sueldo);


    @Select("select * from impuestos.sueldo where idsueldo in (select max(idsueldo) from impuestos.sueldo)")
    List<Sueldo> findSpecific();


}