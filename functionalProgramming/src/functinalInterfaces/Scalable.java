package functinalInterfaces;

//Interfaces are still stateless(no instance fields)

@FunctionalInterface
public interface Scalable {
	
	//Implicitly public abstract
	void setScale(double scale);
	
	
	//public static final
	double DEFAULT_SCALE=1.0;
	
	//Implicitly public
	static boolean isScalebale(Object obj) {
		return obj instanceof Scalable;
	}
	//Implicitly public
	default void resetScale() {
		setScale(DEFAULT_SCALE);
	}
}
