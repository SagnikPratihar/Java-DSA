package StackAndQueues;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            //Doubling the size of the array
            int[] temp = new int[data.length * 2];

            //coping the all elements of the previous array to the new array
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        return super.push(item);
    }
}
