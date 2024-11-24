public class Switch1 {
    public static double areaSwitchCase(int ch, double []a) {
        switch(ch){
		case 1:
            double r = a[0];
			double circleArea = Math.PI * r * r;
			return circleArea;
		case 2:
			double l = a[0];
            double b = a[1];
            double rectangleArea = l * b;
			return rectangleArea;
		}
            return 0;
    }
}