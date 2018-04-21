package designpatterns.bridge;

/**
 * Implementor
 *
 * Define an abstraction for what each resource should be able to provide in
 * order to be displayed.
 */
public interface IResource {
    String getTitle();

    String getBody();
}
