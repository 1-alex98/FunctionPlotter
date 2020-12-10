public class FunctionPlotter {

    public static void plotFunction(Function plotted){
        plotFunction(plotted, (x)->x, (x)->x, -10,10);
    }
    public static void plotFunction(Function plotted, Function xAxis, Function yAxis){
        plotFunction(plotted, xAxis, yAxis, -10,10);
    }

    public static void plotFunction(Function plotted, Function xAxis, Function yAxis, int xStart, int xEnd){
        for (int xCurrent=xStart; xCurrent<=xEnd; xCurrent++){
            double y = plotted.f(xAxis.f(xCurrent));
            plotY(yAxis.f(y));
        }
    }

    private static void plotY(double y) {
        long round = Math.round(y);
        for (int i=0; i<round; i++){
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
