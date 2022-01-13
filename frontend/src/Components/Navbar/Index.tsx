import { ReactComponent as GithubIcon } from 'Assets/img/github.svg';
import './Styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="listenme-nav-content">
                    <h1>LisTenMe</h1>
                    <a href="https://github.com/GenilsonSC">
                        <div className='listenme-contact-container'>
                            <GithubIcon></GithubIcon>
                            <p className='listenme-contact-link'>/GenilsonSC</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}
export default Navbar;