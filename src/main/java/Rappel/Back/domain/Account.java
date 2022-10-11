package Rappel.Back.domain;

@Table(name = "acount")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private String mail;

	private String login;

	private String password;
}
