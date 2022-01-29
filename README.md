                                                KHỞI TẠO LOCAL REPO- VÀ PUSH + TRACK REMOTE ON GITHUB CMD
																								
1. ĐI ĐẾN THƯ MỤC PROJECT (CHANGE DIRECTORY)
	cd {path}
	Ex: cd C:\Users\Administrator\Documents\NetBeansProjects\JavaApplication14
	
2.	KHỞI TẠO LOCAL REPO- (sẽ tạo ra 1 thư mục .git trong project)
	git init
	
3.	ADD FILE SẼ ĐC TRACKING (file đc theo dõi khi có chỉnh sửa)
	git add {filename}
	git add . (nếu muốn add hết file)
	
4. ADD COMMIT
	git commit -m "{message}"
	{message} là chú thích cho commit đó
	
5. SET REMOTE BRANCH (TRACK) CHO BRANCH MASTER + SYNC(LOCAL REPO- => REMOTE REPO-)
	git remote add origin {remote git andress}
	Ex: git remote add origin https://github.com/doanh20cm/1111.git
	git push -u origin master (đẩy lên branch master ở trên remote)
	
	
