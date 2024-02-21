import { Card, Col, Row } from "antd";

export default function Contact()
{
    return (
        <div className="contact">
            <div className="info">

            <Row gutter={16}>
                <Col span={8} >
                    <Card title="Kiran Dongre" style={{margin:'20px'}}>
                        <p><b>Email : </b>kirandongre001@gmail.com</p>
                        <p><b>Phone : </b>+91 9131886090</p>
                        <p><b>LinkedIn :</b><a href="www.linkedin.com/in/kiran-dongre"> www.linkedin.com/in/kiran-dongre </a></p>
                    </Card>

                    <Card title="Shubham Wankar" style={{margin:'20px'}}>
                        <p><b>Email : </b>shubhwankar88@gmail.com</p>
                        <p><b>Phone : </b>+91 8806131273</p>
                    </Card>
                </Col>
                <Col span={8}>

                    <Card title="Kiran Jare" style={{margin:'20px'}}>
                        <p><b>Email : </b>techkjare@gmail.com</p>
                        <p><b>Phone : </b>+91 7225-074716</p>
                    </Card>

                    <Card title="Prathmesh Mane" style={{margin:'20px'}}>
                        <p><b>Email : </b>prathmeshmane@gmail.com</p>
                        <p><b>Phone : </b>+91 9689372672</p>
                    </Card>
                </Col>
            </Row>
            </div>

        </div>
    )
}