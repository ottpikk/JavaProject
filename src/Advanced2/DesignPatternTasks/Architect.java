package Advanced2.DesignPatternTasks;

import Advanced2.DesignPatternTasks.misc.IConnector;
import Advanced2.DesignPatternTasks.misc.MarsRover;
import Advanced2.DesignPatternTasks.misc.mod.DeltaConnectorDecorator;
import Advanced2.DesignPatternTasks.misc.mod.DeltaConnectorProxy;

public class Architect {
    public static void main(String[] args) {
        /**
         * Task1
         * /!\ Make additional class /!\ (file new Class)
         * you need create proxy-mock Pattern for class misc.DeltaConnector (from)
         * create new class in package misc.mod nad make that class to be proxy - mock from DeltaConnector
         * then return instance of that new class
         */
        DeltaConnectorProxy connectorProxy = new DeltaConnectorProxy();
        connectorProxy.connect();
        connectorProxy.deltaAbstract();
        connectorProxy.cltOfffer();


        /**
         * Task2
         * /!\ Make additional class /!\ (file new Class)
         * create Decorator Pattern for class misc.DeltaConnector
         * create new class in package misc.mod nad make that class to be Decorator for misc.DeltaConnector
         * it should decorate method String getDString() (add additional method with signature) String getDString()
         * that method ( String getDString() ) should always return "12345"
         * then create instance of that new class (new created decorator) and return
         */
        DeltaConnectorDecorator deltaConnectorDecorator = new DeltaConnectorDecorator();
        System.out.println(deltaConnectorDecorator.getDString());



        /**
         * Task3
         * NullObject Pattern should be used there
         */
        /*public Object nullObjectPattern(MarsRover marsRover) {
            return null;
        }*/


        /**
         * Task4
         * /!\ modify CODE in protected class ArchitectLazyLoadingTask { (inner class)
         * create LazyLoading pattern for reference
         * task4 should return instance of ArchitectLazyLoadingTask (but modify it to make LazyLoading
         */
        /*public ArchitectLazyLoadingTask task4() {
            return null;
        }

        protected class ArchitectLazyLoadingTask {
            String reference = loadReference();

            *//**
             * Method for load reference
             *//*
            private String loadReference() {
                return "loadRef934345";
            }

            public String getReference() {
                return reference;
            }
        }          */








    }



}
