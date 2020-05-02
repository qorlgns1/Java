package javastudy0501;

import java.io.Serializable;

//영화코드(문자열), 영화제목(문자열),영화평점(실수)을 저장하는 클래스
public class DTO implements Serializable {
	private String movieCode;
	private String movieName;
	private double movieGrade;
	public DTO() {
		super();
		
	}
	public DTO(String movieCode, String movieName, double movieGrade) {
		super();
		this.movieCode = movieCode;
		this.movieName = movieName;
		this.movieGrade = movieGrade;
	}
	public String getMovieCode() {
		return movieCode;
	}
	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getMovieGrade() {
		return movieGrade;
	}
	public void setMovieGrade(double movieGrade) {
		this.movieGrade = movieGrade;
	}
	@Override
	public String toString() {
		return "DTO [movieCode=" + movieCode + ", movieName=" + movieName + ", movieGrade=" + movieGrade + "]";
	}
}