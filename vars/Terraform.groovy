def call() {
    // Import the class from src directory
    def myLibraryClass = load "org/mygurukulam/Clone.groovy"

    // Create an instance of the class
    def myLibraryInstance = new org.mygirukulam.Clone()

    // Call the method using the instance
    myLibraryInstance.checkOutFrom()
}
