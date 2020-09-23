package exercise1;

public class Singers
{

    private String id;
    private String name;
    private String address;
    private String birthDate;
    private int numAlbum;
	
    
    //Constructors
    
	public Singers()
	{
		this("--");
	}

	public Singers(String singerId)
	{
		this(singerId, "--");
	}

	public Singers(String singerId, String singerName)
	{
		this(singerId, singerName, "--");
	}

	public Singers(String singerId, String singerName, String singerAddress)
	{
		this(singerId, singerName, singerAddress, "--");
	}

	public Singers(String singerId, String singerName, String singerAddress, String singerBirthDate)
	{
		this(singerId, singerName, singerAddress, singerBirthDate, 0);
	}

	public Singers(String singerId, String singerName, String singerAddress, String singerBirthDate, int qtAlbum)
	{
		this.id = singerId;
		this.name = singerName;
		this.address = singerAddress;
		this.birthDate = singerBirthDate;
		this.numAlbum = qtAlbum;
	}	
	

	//getters
	
	public String getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getBirthDate()
	{
		return this.birthDate;
	}

	public int getNumAlbum()
	{
		return this.numAlbum;
	}
	
	
	//setters
	
	public void setId(String singerId)
	{
		this.id = singerId;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setBirthDate(String birthDate)
	{
		this.birthDate = birthDate;
	}

	public void setNumAlbum(int numAlbum)
	{
		this.numAlbum = numAlbum;
	}

	public void setAll(String singerId, String singerName, String singerAddress, String singerBirthDate, int qtAlbum)
	{
		this.setId(singerId);
		this.setName(singerName);
		this.setAddress(singerAddress);
		this.setBirthDate(singerBirthDate);
		this.setNumAlbum(qtAlbum);
	}

	
	//Print result
	public String printInfo()
	{
		return "ID: " + this.getId() + "\nName: " + this.getName() + "\nAddress: " + this.getAddress() + "\nBirthDate: " + this.getBirthDate() + "\nQtd Album: " + this.getNumAlbum() + "\n";
	}

}