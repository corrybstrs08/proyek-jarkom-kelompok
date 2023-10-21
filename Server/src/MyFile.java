/*
    KELOMPOK 2
    JUDUL : Client-Server Application	File Sharing Application Using Java
    
    ANGGOTA:
            11S21002 Rifqi Haikal Chairiansyah
            11S21012 Dwi Paranggi Purba
            11S21024 Robert Mangaratua Aritonang
            11S21037 Dastin Raynold Sirait
            11S21047 Corry Betriks Sitorus
    PRODI : S1 INFORMATIKA 2021
*/

/*
 * id - the id of the object
 * name - the name of the file
 * data - the file data
 * fileExtension - the file extension
 *
 */

public class MyFile {

    private int id;
    private String name;
    private byte[] data;
    private String fileExtension;

    public MyFile(int id, String name, byte[] data, String fileExtension) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.fileExtension = fileExtension;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte[] getData() {
        return data;
    }

    public String getFileExtension() {
        return fileExtension;
    }
}