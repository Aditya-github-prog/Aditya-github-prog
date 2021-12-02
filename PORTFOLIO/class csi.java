class csi
{
    csi()
    {
        System.out.println("Hola!!");
    }
    static csi v = new csi();

    public static void main(String args[]) 
    {
        csi b; 
        b = new csi();
    }
}