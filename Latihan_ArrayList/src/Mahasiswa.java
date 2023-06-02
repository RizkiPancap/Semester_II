public class Mahasiswa {
    public String name;
    public String nim;
    public String jurusan;
    public String keterangan;
    public int tahun_lahir;
    public String Jenis_Kelamin;
    


    public Mahasiswa(String name, String nim, String jurusan,int tahun_lahir,String Jenis_Kelamin) {
        this.name = name.length() < 8 ? name+"\t" : name;
        this.nim = nim.length() < 8 ? nim+"\t" : nim;
        this.tahun_lahir = 2023 - tahun_lahir;
        this.Jenis_Kelamin = Jenis_Kelamin;

        this.jurusan = jurusan.length() < 8 ? jurusan+"\t\t" : (jurusan.length() < 16 ? jurusan+"\t" : jurusan);

    
        
        
    }
}