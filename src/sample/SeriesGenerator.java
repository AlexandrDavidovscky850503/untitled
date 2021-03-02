package sample;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;

import java.util.Map;
public class SeriesGenerator {

    private SeriesGenerator(){
    }

    public static XYChart.Series mainCosFunction(GeneralFunction function, String name){
        XYChart.Series series = new XYChart.Series();

        series.setName(name);
        ObservableList listOfData=series.getData();
        for(double i=function.getMinX(); i<function.getMaxX(); i+=function.getStep()){
            listOfData.add(new XYChart.Data(i,FunctionGenerator.getValueOfMainCosFunction(i)));
        }

        return series;
    }

    public static XYChart.Series mainSinFunction(GeneralFunction function, String name){
        XYChart.Series series = new XYChart.Series();

        series.setName(name);
        ObservableList listOfData=series.getData();
        for(double i=function.getMinX(); i<function.getMaxX(); i+=function.getStep()){
            listOfData.add(new XYChart.Data(i,FunctionGenerator.getValueOfMainSinFunction(i)));
        }

        return series;
    }

    public static XYChart.Series seriesFromMapWithOutNulling(Map<Integer, Double> map, String name){
        XYChart.Series series = new XYChart.Series();

        series.setName(name);
        ObservableList listOfData = series.getData();
        for (Integer i : map.keySet()) {
            listOfData.add(new XYChart.Data(i, map.get(i)));
        }

        return series;
    }
}
