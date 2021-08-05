package chapters11;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Emp extends JFrame {

	private JPanel mainPanel;
	private JTextField idField;
	private JPasswordField pwdField;
	private JTextField joinIdField;
	private JTextField joinNameField;
	private JTextField joinPhoneField;
	private JPasswordField joinPwdField;
	private JPasswordField joinRePwdField;
	private JLabel welcomMessage;
	
	private boolean joinIdCheckFlag = false;
	private UserBean loginUserBean = null;
	private JPasswordField updatePwdText;
	private JPasswordField updateRePwdTxt;
	private JTextField updateNameText;
	private JTextField updatePhoneText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp frame = new Emp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Emp() {
		ArrayList<UserBean> userList = new ArrayList<UserBean>();
		
		CardLayout mainCard = new CardLayout();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 522);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(mainCard);
		
		JPanel mainView = new JPanel();
		mainPanel.add(mainView, "name_20595610598400");
		mainView.setLayout(null);
		
		JLabel mainTitleLabel = new JLabel("\uC0AC\uC6D0\uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		mainTitleLabel.setFont(new Font("굴림", Font.BOLD, 30));
		mainTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainTitleLabel.setBounds(296, 74, 373, 62);
		mainView.add(mainTitleLabel);
		
		JButton mainStartButton = new JButton("\uD504\uB85C\uADF8\uB7A8 \uC2DC\uC791");
		mainStartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_20615607195200");
			}
		});
		mainStartButton.setBounds(372, 250, 219, 47);
		mainView.add(mainStartButton);
		
		JPanel loginView = new JPanel();
		mainPanel.add(loginView, "name_20615607195200");
		loginView.setLayout(null);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setBounds(248, 180, 57, 15);
		loginView.add(idLabel);
		
		JLabel pwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLabel.setBounds(248, 235, 57, 15);
		loginView.add(pwdLabel);
		
		idField = new JTextField();
		idField.setBounds(317, 171, 277, 33);
		loginView.add(idField);
		idField.setColumns(10);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(317, 226, 277, 33);
		loginView.add(pwdField);
		
		JLabel loginTitle = new JLabel("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0");
		loginTitle.setFont(new Font("굴림", Font.BOLD, 30));
		loginTitle.setHorizontalAlignment(SwingConstants.CENTER);
		loginTitle.setBounds(365, 73, 229, 33);
		loginView.add(loginTitle);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String idText = idField.getText();
				String pwdText = pwdField.getText();
				
				UserMgrPool userMgrPool = new UserMgrPool();
				if(userMgrPool.loginCheck(idText, pwdText)) {
					loginUserBean = userMgrPool.getUserBean(idText, pwdText);
					welcomMessage.setText(loginUserBean.getUser_name() + "님 환영합니다.");
					mainCard.show(mainPanel, "name_20618782754200");
					return;
				}
				JOptionPane.showMessageDialog(null, "사용자 계정 정보가 잘 못 되었습니다.", "경고", JOptionPane.PLAIN_MESSAGE);
			}
		});
		loginButton.setBounds(617, 171, 97, 88);
		loginView.add(loginButton);
		
		JButton joinButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		joinButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_20621601462100");
			}
		});
		joinButton.setBounds(432, 329, 97, 23);
		loginView.add(joinButton);
		
		JPanel homeView = new JPanel();
		mainPanel.add(homeView, "name_20618782754200");
		homeView.setLayout(null);
		
		JButton logoutButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				idField.setText("");
				pwdField.setText("");
				loginUserBean = null;
				mainCard.show(mainPanel, "name_20595610598400");
			}
		});
		logoutButton.setBounds(836, 427, 97, 23);
		homeView.add(logoutButton);
		
		welcomMessage = new JLabel("New label");
		welcomMessage.setBounds(12, 10, 284, 15);
		homeView.add(welcomMessage);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		model.add(0, "김준일");
		
		
		
		JPanel joinView = new JPanel();
		mainPanel.add(joinView, "name_20621601462100");
		joinView.setLayout(null);
		
		joinIdField = new JTextField();
		joinIdField.setBounds(399, 112, 153, 30);
		joinView.add(joinIdField);
		joinIdField.setColumns(10);
		
		joinNameField = new JTextField();
		joinNameField.setColumns(10);
		joinNameField.setBounds(399, 275, 239, 30);
		joinView.add(joinNameField);
		
		joinPhoneField = new JTextField();
		joinPhoneField.setColumns(10);
		joinPhoneField.setBounds(399, 329, 239, 30);
		joinView.add(joinPhoneField);
		
		joinPwdField = new JPasswordField();
		joinPwdField.setBounds(399, 162, 239, 30);
		joinView.add(joinPwdField);
		
		joinRePwdField = new JPasswordField();
		joinRePwdField.setBounds(399, 216, 239, 30);
		joinView.add(joinRePwdField);
		
		JLabel joinIdLabel = new JLabel("\uC544\uC774\uB514");
		joinIdLabel.setBounds(313, 119, 57, 15);
		joinView.add(joinIdLabel);
		
		JLabel joinPwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		joinPwdLabel.setBounds(313, 169, 57, 15);
		joinView.add(joinPwdLabel);
		
		JLabel joinRePwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		joinRePwdLabel.setBounds(313, 223, 84, 15);
		joinView.add(joinRePwdLabel);
		
		JLabel joinNameLabel = new JLabel("\uC774\uB984");
		joinNameLabel.setBounds(313, 282, 57, 15);
		joinView.add(joinNameLabel);
		
		JLabel joinPhoneLabel = new JLabel("\uC5F0\uB77D\uCC98");
		joinPhoneLabel.setBounds(313, 336, 57, 15);
		joinView.add(joinPhoneLabel);
		
		JLabel joinTitle = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		joinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		joinTitle.setFont(new Font("굴림", Font.BOLD, 30));
		joinTitle.setBounds(385, 22, 200, 42);
		joinView.add(joinTitle);
		
		JButton idCheckButton = new JButton("\uC911\uBCF5\uD655\uC778");
		idCheckButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String joinIdText = joinIdField.getText();
				JoinNgrPool joinNgrPool = new JoinNgrPool();
				
				if(joinIdText.length() != 0) {
					if(joinNgrPool.idCheck(joinIdText)) {
						JOptionPane.showMessageDialog(null, "가입할 수 없는 아이디입니다.", "경고", JOptionPane.WARNING_MESSAGE);
						return;
					
					}
					JOptionPane.showMessageDialog(null, joinIdText + "는 사용 가능한 아이디입니다.", "확인", JOptionPane.INFORMATION_MESSAGE);
					joinIdCheckFlag = true;
				}else {
					JOptionPane.showMessageDialog(null, "공백은 입력할 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		idCheckButton.setBounds(554, 112, 84, 30);
		joinView.add(idCheckButton);
		
		JButton joinSubmitButton = new JButton("\uAC00\uC785\uD558\uAE30");
		joinSubmitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String joinIdText = joinIdField.getText();
				String joinPwdText = joinPwdField.getText();
				String joinRePwdText = joinRePwdField.getText();
				String joinNameText = joinNameField.getText();
				String joinPhoneText = joinPhoneField.getText();
				if(joinIdCheckFlag == false) {
					JOptionPane.showMessageDialog(null, "아이디 중복확인이 되지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinPwdText.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호는 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinRePwdText.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호 확인은 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinNameText.length() == 0) {
					JOptionPane.showMessageDialog(null, "이름은 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinPhoneText.length() == 0) {
					JOptionPane.showMessageDialog(null, "연락처는 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(!joinPwdText.equals(joinRePwdText)){
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else {
					UserBean userBean = new UserBean();
					userBean.setUser_id(joinIdText);
					userBean.setUser_pwd(joinRePwdText);
					userBean.setUser_name(joinNameText);
					userBean.setUser_phone(joinPhoneText);
					JoinNgrPool joinNgrPool = new JoinNgrPool();
					if(joinNgrPool.joinSubmit(userBean)) {
					joinIdField.setText("");
					joinPwdField.setText("");
					joinRePwdField.setText("");
					joinNameField.setText("");
					joinPhoneField.setText("");
					joinIdCheckFlag = false;
					JOptionPane.showMessageDialog(null, "축하합니다.\n회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
					mainCard.show(mainPanel, "name_20615607195200");
					}
					else{JOptionPane.showMessageDialog(null, "ㄴ축하합니다.\nㄴ회원가입에 성공하였습니다.", "ㄴ회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
					mainCard.show(mainPanel, "name_20615607195200");
						
					}
					
					};
				}
				
			
		});
		joinSubmitButton.setBounds(313, 383, 325, 42);
		joinView.add(joinSubmitButton);
		
		JPanel userInfoPhone = new JPanel();
		mainPanel.add(userInfoPhone, "name_8576375731900");
		userInfoPhone.setLayout(null);
		
		JLabel updatePwdLable = new JLabel("\uBE44\uBC00\uBC88\uD638");
		updatePwdLable.setBounds(495, 137, 57, 15);
		userInfoPhone.add(updatePwdLable);
		
		JLabel updateRePwdLable = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		updateRePwdLable.setBounds(495, 191, 84, 15);
		userInfoPhone.add(updateRePwdLable);
		
		JLabel updateNameLable = new JLabel("\uC774\uB984");
		updateNameLable.setBounds(495, 250, 57, 15);
		userInfoPhone.add(updateNameLable);
		
		updatePwdText = new JPasswordField();
		updatePwdText.setBounds(581, 130, 239, 30);
		userInfoPhone.add(updatePwdText);
		
		updateRePwdTxt = new JPasswordField();
		updateRePwdTxt.setBounds(581, 184, 239, 30);
		userInfoPhone.add(updateRePwdTxt);
		
		updateNameText = new JTextField();
		updateNameText.setColumns(10);
		updateNameText.setBounds(581, 243, 239, 30);
		userInfoPhone.add(updateNameText);
		
		updatePhoneText = new JTextField();
		updatePhoneText.setColumns(10);
		updatePhoneText.setBounds(581, 297, 239, 30);
		userInfoPhone.add(updatePhoneText);
		
		JLabel updatePhoneLable = new JLabel("\uC5F0\uB77D\uCC98");
		updatePhoneLable.setBounds(495, 304, 57, 15);
		userInfoPhone.add(updatePhoneLable);
		
		JLabel updateUserTitle = new JLabel("\uD68C\uC6D0\uC815\uBCF4 \uC218\uC815");
		updateUserTitle.setBounds(649, 63, 118, 38);
		userInfoPhone.add(updateUserTitle);
		
		JLabel userInfoTitle = new JLabel("\uD68C\uC6D0\uC815\uBCF4");
		userInfoTitle.setBounds(185, 63, 118, 38);
		userInfoPhone.add(userInfoTitle);
		
		JLabel userInfoId = new JLabel("\uC544\uC774\uB514");
		userInfoId.setBounds(38, 130, 57, 15);
		userInfoPhone.add(userInfoId);
		
		JLabel userInfoName = new JLabel("\uC774\uB984");
		userInfoName.setBounds(38, 155, 57, 15);
		userInfoPhone.add(userInfoName);
		
		JLabel userInfoIdPhone = new JLabel("\uC5F0\uB77D\uCC98");
		userInfoIdPhone.setBounds(38, 184, 57, 15);
		userInfoPhone.add(userInfoIdPhone);
		
		JLabel userInfoldLabel = new JLabel("New label");
		userInfoldLabel.setBounds(107, 130, 90, 15);
		userInfoPhone.add(userInfoldLabel);
		
		JLabel userInfopwdLabel = new JLabel("New label");
		userInfopwdLabel.setBounds(107, 155, 90, 15);
		userInfoPhone.add(userInfopwdLabel);
		
		JLabel userInfoPhoneLabel = new JLabel("New label");
		userInfoPhoneLabel.setBounds(107, 184, 90, 15);
		userInfoPhone.add(userInfoPhoneLabel);
		
		JButton updateSubmitUser = new JButton("\uC815\uBCF4 \uC218\uC815\uD558\uAE30");
		updateSubmitUser.setBounds(553, 369, 267, 23);
		userInfoPhone.add(updateSubmitUser);
		
		JButton deleteSubmitUser_1 = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		deleteSubmitUser_1.setBounds(36, 369, 267, 23);
		userInfoPhone.add(deleteSubmitUser_1);
		
		JButton userInfoHomeButton = new JButton("\uBA54\uC778\uD654\uBA74");
		userInfoHomeButton.setBounds(770, 440, 97, 23);
		userInfoPhone.add(userInfoHomeButton);
	}
}
