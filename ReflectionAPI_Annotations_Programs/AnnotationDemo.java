import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface APIDescription {
    String description();
}
@APIDescription(description = "User service class for API management")
class UserService {
    @APIDescription(description = "Fetch user details")
    public void getUser() {}
}
public class AnnotationDemo {
    public static void main(String[] args) {
        Class<UserService> clazz = UserService.class;
        if (clazz.isAnnotationPresent(APIDescription.class)) {
            System.out.println("Class: " + clazz.getAnnotation(APIDescription.class).description());
        }
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(APIDescription.class)) {
                System.out.println("Method: " + method.getName() +
                                   " -> " + method.getAnnotation(APIDescription.class).description());
            }
        }
    }
}